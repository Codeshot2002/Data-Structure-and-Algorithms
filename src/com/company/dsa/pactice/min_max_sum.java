package com.company.dsa.pactice;

import java.util.ArrayList;
import java.util.List;

public class min_max_sum {
    public static void miniMaxSum(List<Integer> arr){
        long max = arr.get(0);
        long min = arr.get(0);
        long sum = arr.get(0);
        for(int i = 1; i<arr.size();i++){
            if(max<arr.get(i)){
                max = arr.get(i);
            }
            if(min>arr.get(i)){
                min = arr.get(i);
            }
            sum += arr.get(i);
        }
        System.out.print((sum-max) + " " + (sum-min));
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(9);
        miniMaxSum(arr);
    }
}
