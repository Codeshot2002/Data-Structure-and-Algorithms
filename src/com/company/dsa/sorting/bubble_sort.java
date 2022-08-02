package com.company.dsa.sorting;

public class bubble_sort {
    public void bubble(int[] arr){
        int len = arr.length;
        for(int i=0; i<len-1; i++){
            for(int j=0; j<len-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] marks = {13,17,5,10,20,3,5};
        bubble_sort sorting = new bubble_sort();
        sorting.bubble(marks);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i] + ", ");
        }
    }
}
