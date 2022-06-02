#include <iostream>
using namespace std;

void MergeSort(int *a, int lowerindex, int higherindex, int middle)
{
	
	int i, j, k, temp[higherindex-lowerindex+1];
	i = lowerindex;
	k = 0;
	j = middle + 1;

	while (i <= middle && j <= higherindex)
	{
		if (a[i] < a[j])
		{
			temp[k] = a[i];
			k++; 
			i++;
		}
		else
		{
			temp[k] = a[j];
			k++;
			j++;
		}
	}

	while (i <= middle)
	{
		temp[k] = a[i];
		k++;
		i++;
	}

	while (j <= higherindex)
	{
		temp[k] = a[j];
		k++;
		j++;
	}
 

	for (i = lowerindex; i <= higherindex; i++)
	{
		a[i] = temp[i-lowerindex];
	}
}

void MergeSort(int *a, int lowerindex, int higherindex)
{
	int middle;
	if (lowerindex < higherindex)
	{
		middle=(lowerindex+higherindex)/2;
		
		MergeSort(a, lowerindex, middle);
		MergeSort(a, middle+1, higherindex);
		MergeSort(a, lowerindex, higherindex, middle);
	}
}
 
int main()
{
	int n, i;
	cout<<"<<< INPUT THE TOTAL NUMBER OF ELEMENTS >>>\n";
	cin>>n;
 
	int arr[n];
	for(i = 0; i < n; i++)
	{
		cout<<"ENTER ELEMENT"<<i+1<<": ";
		cin>>arr[i];
	}
 
MergeSort(arr, 0, n-1);
 
	cout<<"ARRAY AFTER PERFORMING MERGE SORT\n";
	for (i = 0; i < n; i++)
        cout<<"->"<<arr[i];
 
	return 0;
}