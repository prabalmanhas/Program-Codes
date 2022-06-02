#include<iostream>
using namespace std;

int Day1Lect (int arr[], int lowerindex, int higherindex , int p)
{
    if(higherindex >= lowerindex){
        int middle = (higherindex + lowerindex)/2;
        if(arr[middle] == p){
            return middle;
        }
        if(arr[middle] > p){
            return Day1Lect(arr, lowerindex, middle-1, p);
        }
        return Day1Lect(arr, middle+1, higherindex, p);
    }
    return -1;
}


int main()
{
    int p,i,n;

    cout<<"<----------- BINARY SEARCH IMPLEMENTATION PROGRAM ---------->\n";
    cout<<"****ENTER THE NO. ELEMENTS OF ARRAY ****\n";
    cin>>n;
    int arr[n];
    cout<<"INPUT THE ELEMETS IN ASCENDING ORDER\n";
    for(i=0;i<n;i++){
        cin>>arr[i];
    }

    cout<<"********* ENTER THE DESIRED ITEM ************\n";
    cin>>p;
    int finaloutput = Day1Lect(arr, 0, n-1, p);
    if(finaloutput == -1){
        cout<<"SORRY ELEMENT NOT FOUND"<<endl;
    }
    else
        cout<<"YOUR ELEMENT IS PRESENT AT INDEX "<<finaloutput<<" IN THE ARRAY"<<endl;
    return 0;
}