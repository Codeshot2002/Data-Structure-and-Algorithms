package com.company.dsa.pactice;

import java.util.Locale;

public class hackerRank2 {
    public static boolean check(String s1, String s2){
        char ch1[];
        char ch2[];
        s1 = s1.toLowerCase(Locale.ROOT);
        s2 = s2.toLowerCase(Locale.ROOT);
        ch1 = s1.toCharArray();
        ch2 = s2.toCharArray();
        int as1 = 0;
        int as2 = 0;
        for(int i=0;i<s1.length();i++){
            as1 += ch1[i];
        }
        for(int j=0;j<s2.length();j++){
            as2 += ch2[j];
        }
        System.out.println(s1 + " ascii : " + as1);
        System.out.println(s2 + " ascii : " + as2);
        if(as1==as2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s1 = "umang";
        String s2 = "unamk";
        if(s1.compareTo(s2) == 0){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
        System.out.println(s1.compareTo(s2));
    }
}
