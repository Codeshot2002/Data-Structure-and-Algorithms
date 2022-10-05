package com.company.dsa.searching;

public class binary_search {
    static boolean order(int[] array){
        if(array[0] > array[1]){
            return false;  //desc
        }else{
            return true;    //asc
        }
    }
    public static int binarySearch(int[] sortedarray, int target){
        int start = 0;
        int end = sortedarray.length - 1;
        if(order(sortedarray)){
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
    public static int RbinarySearch(int[] arr, int l, int r, int target) {
        if (r >= l) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                return RbinarySearch(arr, l, mid - 1, target);
            }
            return RbinarySearch(arr, mid + 1, r, target);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={2,3,6,10,12,16,19,21};
//        System.out.println(binarySearch(arr,15));
//        System.out.println(order(arr));
//        System.out.println("  -----  ");
    }

}
