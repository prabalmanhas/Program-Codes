#include<iostream>
#include<cstring>
#include<cstdio>
#define d 256 // Number of characters in input alphabet
using namespace std;


void search(char *txt , char *pat , int q){
int m=strlen(pat);
int n=strlen(txt);
 
int i,j;
int p=0; // hash value for pattern
int t=0; // hash value for text
int h=1; // d^(m-1) value
 
// The value of h would be "pow(d, M-1)%q"
 
for(i=0;i<m-1;i++){
h=(d*h)%q;
}
 
// Calculate the hash value of pattern and first window of text
 
for(i=0;i<m;i++){
p=(d*p+pat[i])%q;
t=(d*t+txt[i])%q;
}
 
for(i=0;i<=n-m;i++){
 
// Check if the current sliding window of text and pattern have same hash values
 
if(t==p){
// Check if all characters are same or it's a SPURIOUS HIT !
 
for(j=0;j<m;j++){
if(txt[i+j]!=pat[j]) {
break;
}
}
if(j==m)
cout<<endl<<"PATTERN MATCHED AT >> "<<i<<endl;
}
 
// Calculate hash value for next window of text: Removing Old-high oder digit
// adding new-low order digit
 
if(i<n-m){
t = (d*(t - txt[i]*h) + txt[i+m])%q;
 
// We might get negative value of t, converting it to positive
 
if(t < 0)
t = (t + q);
}
}
}
 
int main(){
char a[50],b[50];
cout<<"PLEASE ENTER YOUR TEXT STRING >> "<<endl;
gets(a);
cout<<endl<<"ENTER THE SUB-STRING >> "<<endl;
gets(b);
int q=101; // A Prime Number
search(a,b,q);
return 0;
}