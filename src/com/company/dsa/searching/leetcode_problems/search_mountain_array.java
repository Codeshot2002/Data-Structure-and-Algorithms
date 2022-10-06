package com.company.dsa.searching.leetcode_problems;

import java.util.ArrayList;
import java.util.List;

public class search_mountain_array {
    public static int binarySearch(MountainArray sortedarray, int target,int start,int end){
        boolean order = false;
        if(sortedarray.get(start) < sortedarray.get(start+1)){
            order = true;
        }
        if(order){
            while(start <= end){
                int mid = start + (end-start)/2;
                if(target < sortedarray.get(mid)){   //Go left
                    end = mid - 1;
                }
                else if(target > sortedarray.get(mid)){     //Go right
                    start = mid + 1;
                }
                else{
                    return mid;
                }
            }
        }else{
            while(start <= end){
                int mid = start + (end-start)/2;
                if(target < sortedarray.get(mid)){   //Go right
                    start = mid + 1;
                }
                else if(target > sortedarray.get(mid)){     //Go left
                    end = mid - 1;
                }
                else{
                    return mid;
                }
            }
        }
        return -1;
    }
    public static int peakIndexInMountainArray(MountainArray nums) {
        int start = 0 ;
        int end = nums.length()-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums.get(mid) > nums.get(mid+1)){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int leftside = binarySearch(mountainArr,target,0,peak);
        int rightside = binarySearch(mountainArr,target,peak,mountainArr.length());
        System.out.println(peak);
        System.out.println(leftside);
        System.out.println(rightside);
        if(leftside!=-1){
            return leftside;
        }
        return rightside;
    }

    public static void main(String[] args) {
        MountainArray arr = new MountainArray();
        int[] a = {0,5,3,1};
        arr.add(a);
       //System.out.println(findInMountainArray(1,arr));
        System.out.println(binarySearch(arr,1,1,3));
    }
}
