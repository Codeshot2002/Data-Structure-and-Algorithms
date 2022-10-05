package com.company.dsa;

import java.util.ArrayList;
import java.util.MissingFormatArgumentException;

public class Main {
    public int decimalToBinary(int num){
        if(num<=1){
            return 1;
        }
        return num%2 + 10*decimalToBinary(num/2);
    }
    public int sumofArray(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
        //time complexity = O(N)
    }
    public int proofArray(int[] arr){
        int pro = 1;
        for(int i=0;i<arr.length;i++){
            pro *= arr[i];
        }
        return pro;
        //time complexity = O(N)
    }
    public void pair(int[] arr){
        ArrayList<String> myarray = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                myarray.add(Integer.toString(arr[i]) + Integer.toString(arr[j]));
            }
        }
        System.out.println(myarray);
    }
    public static void main(String[] args) {

    }
}
