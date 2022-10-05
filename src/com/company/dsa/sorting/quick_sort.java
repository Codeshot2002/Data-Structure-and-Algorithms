package com.company.dsa.sorting;

public class quick_sort {
    static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
        for(int j = low; j <= high - 1; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    static void QuickSort(int[] arr, int l, int h){
        if(l<h){
            int pivot = partition(arr,l,h);
            QuickSort(arr,l,pivot-1);
            QuickSort(arr,pivot+1,h);
        }
    }
    static void printArray(int a[], int n)
    {
        int i;
        for (i = 0; i < n; i++) System.out.print(a[i] + " ");
    }
    public static void main(String[] args) {
        int[] array = {5,2,9,6,1,3,7,8,4};
        System.out.println("Before quick sort : ");
        printArray(array, array.length);
        System.out.println();
        System.out.println("After quick sort : ");
        QuickSort(array,0,array.length-1);
        printArray(array,array.length);

    }
}
