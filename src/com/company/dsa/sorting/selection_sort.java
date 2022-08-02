package com.company.dsa.sorting;

import java.nio.channels.SelectableChannel;

public class selection_sort {
    public static void selectionSort(int[] array){
        for(int i=0;i<array.length;i++){
            int min = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            if(min!=i){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ ", ");
        }
    }
    public static void main(String[] args) {
        int[] test = {10,1,3,6,14,16};
        selection_sort.selectionSort(test);
        selection_sort.printArray(test);
    }
}
