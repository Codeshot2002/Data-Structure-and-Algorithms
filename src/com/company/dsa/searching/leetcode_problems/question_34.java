package com.company.dsa.searching.leetcode_problems;

import java.util.Arrays;

//Find First and Last Position of Element in Sorted Array
public class question_34 {
    public static int binarySearch(int[] a, int target,boolean findingFirst){
        int start = 0;
        int end = a.length-1;
        int res = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < a[mid]){
                end = mid - 1;
            }
            else if(target > a[mid]){
                start = mid + 1;
            }
            else{
                res = mid;
                if(findingFirst){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = binarySearch(nums,target,true);
        ans[1] = binarySearch(nums,target,false);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,2};
        //System.out.println(Arrays.toString(searchRange(nums,2)));
    }
}
