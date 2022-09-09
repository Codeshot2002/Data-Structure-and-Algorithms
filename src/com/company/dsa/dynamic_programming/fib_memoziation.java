package com.company.dsa.dynamic_programming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class fib_memoziation {
    public static void main(String[] args) {
        HashMap<Integer,Integer> memo = new HashMap<>();
        System.out.println(fib_memo(5,memo));

    }
    static int fib_memo(int n, HashMap<Integer, Integer> memo){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        if(!memo.containsKey(n)){
            memo.put(n,(fib_memo(n-1,memo) + fib_memo(n-2, memo)));
        }
        return memo.get(n);
    }
}
