package com.company.dsa.pactice;

import java.util.SortedSet;
import java.util.TreeSet;

public class sorted_set {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        int[] ar ={10,2,3,15,5,8};
        for(int a : ar){
            set.add(a);
        }
        System.out.println(set);
    }
}
