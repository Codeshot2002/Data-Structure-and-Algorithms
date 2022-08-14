package com.company.dsa.pactice;

import java.util.ArrayList;
import java.util.List;

public class plus_minus_ratio {
    public static void plusMinus(List<Integer> arr){
        float positive = 0, negative = 0, zero = 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) > 0){
                positive += 1;
            }
            if(arr.get(i) < 0){
                negative += 1;
            }
            if(arr.get(i) == 0){
                zero += 1;
            }
        }
        float length = arr.size();
        System.out.println(positive/length);
        System.out.println(negative/length);
        System.out.println(zero/length);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-1);
        plusMinus(arr);
    }
}
