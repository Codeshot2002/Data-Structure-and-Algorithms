package com.company.dsa.recursion;

public class sum_of_n {
    static int sumof(int n){
        if(n==0){
            return 0;
        }
        return n + (n-1);
    }

    public static void main(String[] args) {
        System.out.println(sumof(2));
    }
}
