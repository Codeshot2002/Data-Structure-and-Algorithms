package com.company.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class Array_questions {
    static boolean sorted(int[] ar, int index){
        if(index == ar.length-1) {
            return true;
        }
        return ar[index] < ar[index + 1] && sorted(ar,index + 1);
    }
    //linear search using recursion 
    static int linear_search(int[] ar, int target, int index){
        if(ar[index] == target){
            return index;
        }
        if(index == ar.length-1){
            return -1;
        }
        return linear_search(ar,target,index+1);
    }
    //linear search using recursion with multiple occurrences 
    static ArrayList<Integer> linear_searchM(int[] ar, int target, int index, ArrayList<Integer> list){
        if(ar[index] == target){
            list.add(index);
        }
        if(index == ar.length-1){
            return list;
        }
        return linear_searchM(ar, target, index + 1, list);
    }

    //linear search using recursion with multiple occurrences but withiout passing arrayList
    static ArrayList<Integer> l_search(int[] ar, int target, int index){
        ArrayList<Integer> list2 = new ArrayList<>();
        if(index == ar.length){
            return list2;
        }
        if(ar[index] == target){
            list2.add(index);
        }
        ArrayList<Integer> new_list = l_search(ar,target,index+1);
        list2.addAll(new_list);
        return list2;
    }
    public static void main(String[] args) {
        int[] ar = {1,3,5,7,16,13,3,7};
        System.out.println(sorted(ar,0));
        ArrayList<Integer> list = new ArrayList<>();
        linear_searchM(ar,3,0,list);
        System.out.println(list);
        System.out.println(l_search(ar,7,0));
    }
}
