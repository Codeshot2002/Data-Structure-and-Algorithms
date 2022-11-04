package com.company.dsa.searching.leetcode_problems;

import java.util.ArrayList;
import java.util.List;

public class search_mountain_array {
    public static int binarySearch(int[] sortedarray, int target,int start,int end){
        boolean order = false;
        if(sortedarray[start] < sortedarray[end]){
            order = true;
        }
        if(order){
            while(start <= end){
                int mid = start + (end-start)/2;
                if(target < sortedarray[mid]){   //Go left
                    end = mid - 1;
                }
                else if(target > sortedarray[mid]){     //Go right
                    start = mid + 1;
                }
                else{
                    return mid;
                }
            }
        }else{
            while(start <= end){
                int mid = start + (end-start)/2;
                if(target < sortedarray[mid]){   //Go right
                    start = mid + 1;
                }
                else if(target > sortedarray[mid]){     //Go left
                    end = mid - 1;
                }
                else{
                    return mid;
                }
            }
        }
        return -1;
    }
    public static int peakIndexInMountainArray(int[] nums) {
        int start = 0 ;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid] > nums[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    public static int findInMountainArray(int target, int[] mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        System.out.println(peak);
        int leftside = binarySearch(mountainArr,target,0,peak);
        int rightside = binarySearch(mountainArr,target,peak+1,mountainArr.length-1);

        if(leftside!=-1){
            return leftside;
        }
        return rightside;
    }

    public static void main(String[] args) {
        int[] a = {7,8,1,2,3,4,5,6};
        System.out.println(findInMountainArray(2,a));
       // System.out.println(binarySearch(a,1,1,3));
    }
}
