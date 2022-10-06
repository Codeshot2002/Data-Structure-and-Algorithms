package com.company.dsa.searching.leetcode_problems;

public class mountain_array {
    public static int peakIndexInMountainArray(int[] nums) {
        int start = 1;
        int end = nums.length-2;
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid-1] < nums[mid] && nums[mid+1] > nums[mid]){
                start = mid + 1;
            }
            else if(nums[mid+1] < nums[mid] && nums[mid-1] > nums[mid]){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {3,4,5,1};
        System.out.println(peakIndexInMountainArray(a));
    }
}
