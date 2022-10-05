package com.company.dsa.recursion;

public class paths_from_left_to_right {
    static int path(int n,int m){
        if(n==1 || m==1) return 1;
        return path(n,m-1) + path(n-1,m);
    }

    public static void main(String[] args) {
        System.out.println(path(3,3));
    }
}
