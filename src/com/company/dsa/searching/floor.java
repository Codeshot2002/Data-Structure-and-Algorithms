package com.company.dsa.searching;

public class floor {
    public static int floor(int[] a, int target){
        int start = 0;
        int end = a.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<a[mid]){
                end = mid-1;
            }
            else if(target > a[mid]){
                start = mid + 1;
            }
            else{
                return a[mid];
            }
        }
        return a[end];
    }

    public static void main(String[] args) {
        int[] a = {1,5,7,11,15,16};
        System.out.println(floor(a,14));
    }
}
