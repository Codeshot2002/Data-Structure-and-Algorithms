package com.company.dsa.dynamic_programming;

import java.util.HashMap;

public class staircase {
    static int func(int n, HashMap<Integer,Integer> m){
        if(n==1) return 1;
        if (n==2) return 2;
        if(!m.containsKey(n)){
            m.put(n,func(n-1,m)+ func(n-2,m));
        }
        return m.get(n);
    }

    public static void main(String[] args) {
        HashMap<Integer,Integer> m = new HashMap<>();
        System.out.println(func(5,m));
    }
}
