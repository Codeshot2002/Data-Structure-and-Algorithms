package com.company.dsa.searching;

public class ceiling {
    public static int ceiling(int[] ar, int target){
        int start = 0;
        int end = ar.length-1;
        int mid = 0;
        while(start<=end){
            mid = start + (end-start)/2;
            if(target < ar[mid]){
                end = mid - 1;
            }
            else if(target > ar[mid]){
                start = mid + 1;
            }
            else if(target == ar[mid]){
                return mid;
            }
        }
        return ar[start];
    }

    public static void main(String[] args) {
        int[] a = {1,5,7,11,15,16};
        System.out.println(ceiling(a,12));
    }
}
