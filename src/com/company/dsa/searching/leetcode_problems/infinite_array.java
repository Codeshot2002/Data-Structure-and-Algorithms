package com.company.dsa.searching.leetcode_problems;

public class infinite_array {
    static int binary(int[] a, int target){
        int start = 0;
        int end = 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < a[mid]){
                end = mid - 1;
            }
            else if(target > a[mid]){
                start = mid + 1;
                end *= 2;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ar = {1,3,5,7,9,11,13,15,17,19,21,23,25};
        System.out.println(binary(ar,17));
    }
}
