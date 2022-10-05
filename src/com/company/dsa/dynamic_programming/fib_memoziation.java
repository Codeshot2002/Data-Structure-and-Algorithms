package com.company.dsa.dynamic_programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class fib_memoziation {
    public static void main(String[] args) {
        HashMap<Integer,Integer> memo = new HashMap<>();
        System.out.println(fib_memo(5,memo));
        System.out.println(fib_tab(6));
    }
    //fibonacci using memoziation
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

    //fibonnaci with tabulation
    static int fib_tab(int n){
        ArrayList<Integer> tb = new ArrayList<>();
        tb.add(0);
        tb.add(1);
        for(int i=2;i<=n-1;i++){
            int n1 = tb.get(i-1);
            int n2 = tb.get(i-2);
            tb.add(n1+n2);
        }
        return tb.get(n-1);
    }

}
