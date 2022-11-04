package com.company.dsa.recursion;

public class recursion {
    public static void main(String[] args) {
        mesg1();
    }
    static void mesg1(){
        mesg2();
        System.out.println("Hello mesg1");
    }
    static void mesg2(){
        mesg3();
        System.out.println("Hello mesg3");
    }
    static void mesg3(){
        mesg4();
        System.out.println("Hello mesg3");
    }
    static void mesg4(){
        System.out.println("Hello mesg4");
    }
}
