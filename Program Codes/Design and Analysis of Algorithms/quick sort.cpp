#include <bits/stdc++.h>
using namespace std;

int partition(int *a, int start, int end)
{
    int pivot = a[end];
    

    int PivotValue = start;
    int i, t; 


    for (i = start; i < end; i++)
    {
        if (a[i] <= pivot)
        {
            t = a[i];
            a[i] = a[PivotValue];
            a[PivotValue] = t;
            PivotValue++;
        }
    }

    t = a[end];
    a[end] = a[PivotValue];
    a[PivotValue] = t;

    return PivotValue;
}
void Quicksort(int *a, int start, int end)
{
    if (start < end)
    {
        int PivotValue = partition(a, start, end);
        Quicksort(a, start, PivotValue - 1);
        Quicksort(a, PivotValue + 1, end);
    }
}

int main()
{
    int n;
    cout << "ENTER THE NUMBER OF ELEMENTS = ";
    cin >> n;
    int a[n];
    cout << "ENTER THE ELEMENTS PRESENT IN THE ARRAY = \n";
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    Quicksort(a, 0, n - 1);
    cout << "ARRAY AFTER PERFORMING THE QUICK SORT = \n";
    for (int i = 0; i < n; i++)
    {
        cout << a[i] << " ";
    }
    return 0;
}