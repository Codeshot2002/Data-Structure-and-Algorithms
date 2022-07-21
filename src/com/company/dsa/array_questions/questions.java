package com.company.dsa.array_questions;

public class questions {
    public void checksum(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }
    public int max_product(int[] arr){
        int max = 0;
        System.out.print("Max product pairs : ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[i] * arr[j] > max){
                   max = arr[i] * arr[j];
                   System.out.print(" (" + i + "," + j + ") ");
               }
            }
        }
        return max;
    }

    public boolean duplicate(int[] arr){
        boolean check = true;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    check = false;
                }
            }
        }
        return check;
    }
    public static void main(String[] args) {
        questions obj = new questions();
        int[] ar = {1,2,3,4,17,17};
        int target = 7;
        obj.checksum(ar,target);
        System.out.println("Max product of this array is : " + obj.max_product(ar));
        System.out.println(obj.duplicate(ar));
    }
}
