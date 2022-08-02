package com.company.dsa.sorting;

public class Insertion_sort {
    static void insertionSort(int[] arr){
        for(int i=1; i<arr.length;i++){
            int temp = arr[i];
            int j = i;
            while(j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            if(i<array.length-1){
                System.out.print(array[i]+ ", ");
            }
            else{
                System.out.print(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,6,2,8,10,1,13,12,4};
        insertionSort(arr);
        printArray(arr);
    }
}
