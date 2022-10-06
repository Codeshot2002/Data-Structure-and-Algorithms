package com.company.dsa.searching.leetcode_problems;

import java.util.ArrayList;
import java.util.List;

public class MountainArray {
    List<Integer> arr = new ArrayList<>();
    public int get(int index){
        return arr.get(index);
    }
    public int length(){
        return arr.size();
    }
    public void add(int[] data){
        for(int a:data){
            arr.add(a);
        }
    }
}
