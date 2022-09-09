package com.company.dsa.Divide_conquer_algo;

public class fibonacci {
    static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }

        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
