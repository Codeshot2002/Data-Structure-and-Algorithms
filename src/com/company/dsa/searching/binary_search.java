package com.company.dsa.searching;

public class binary_search {
    public static int binarySearch(int[] sortedarray, int target){
        int i = 0;
        int j = sortedarray.length-1;
        int m = (i+j)/2;
        while(i!=j){
            if(sortedarray[m] == target){
                return m;
            }else{
                if(target <= sortedarray[m]){
                    j = m;
                    m = (i + j)/2;
                }
                else{
                    i = m;
                    m = (i+j)/2;
                }
            }
        }
        return m;
    }
    public static int RbinarySearch(int[] arr, int l, int r, int target){
        if(r >= l){
            int mid  = (l + r)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                return RbinarySearch(arr,l,mid-1,target);
            }
            return RbinarySearch(arr,mid+1,r,target);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={10,11,12,13,14,15};
        System.out.println(binarySearch(arr,5));
        System.out.println(RbinarySearch(arr,0,arr.length-1,15));
    }

}
