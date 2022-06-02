#include <iostream>
#include <bits/stdc++.h>

using namespace std;
 
typedef struct {
    int value;
    int weight;
    float density;
}Item;
 
void input(Item items[],int sizeOfItems){
    cout << "ENTER TOTAL "<< sizeOfItems <<" ITEMS VALUE AND WEIGHT" << endl;
    for(int i=0; i<sizeOfItems; i++){
        cout << "ENTER "<< i+1 << " VALUE ";
        cin >> items[i].value;
        cout << "ENTER "<< i+1 << " WEIGHT ";
        cin >> items[i].weight;
    }
}
 
void display(Item items[],int sizeOfItems){
  cout << "VALUES:   ";
  for(int i=0; i<sizeOfItems; i++){
      cout << items[i].value << "\t";
  }

  cout << endl << "WEIGHT:   ";
  for(int i=0; i<sizeOfItems; i++){
      cout << items[i].weight << "\t";
  }
  cout << endl;
}
 
bool compare(Item i1, Item i2){
    return (i1.density > i2.density);
}
 
float knapsack(Item items[],int sizeOfItems, int W){
    float totalValue=0, totalWeight=0;
 
    //calculating density of each item
    for(int i=0; i<sizeOfItems; i++){
        items[i].density = items[i].value/items[i].weight;
    }
 
    //sorting w.r.t to density using compare function
    sort(items, items+sizeOfItems,compare);
 
  for(int i=0; i<sizeOfItems; i++){
    if(totalWeight + items[i].weight<= W){
      totalValue += items[i].value ;
      totalWeight += items[i].weight;
    } else {
      int wt = W-totalWeight;
      totalValue += (wt * items[i].density);
      totalWeight += wt;
      break;
    }
}
  cout << "TOTAL WEIGHT IN THE BAG: " << totalWeight<<endl;
  return totalValue;
}
int main()
{
  int W;
  Item items[3];
  input(items,3);
  cout << "YOUR ENTERED DATA: \n";
  display(items,3);
  cout<< "ENTER KNAPSACK WEIGHT: \n";
  cin >> W;
  float mxVal = knapsack(items,3,W);
  cout << ">>> MAXIMUM VALUE FOR "<< W <<" WEIGHT IS: "<< mxVal;
 
  return 0;
}