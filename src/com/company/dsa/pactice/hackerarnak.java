package com.company.dsa.pactice;

import java.util.ArrayList;
import java.util.List;

public class hackerarnak {
    public static List<String> possibleChanges(List<String> usernames) {
        List<String> end = new ArrayList<>();
        for(int i=0;i<usernames.size();i++){
            if(!isNumber(usernames.get(i))){
                if(alpha(usernames.get(i))){
                    end.add("Yes");
                }
                else{
                    end.add("No");
                }
            }
        }
        return end;
    }
    public static boolean isNumber(String s)
    {
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)) == false)
                return false;

        return true;
    }
    public static boolean alpha(String s1){
        char[] ch;
        ch = s1.toCharArray();
        for(int i = 0;i<s1.length();i++){
            for(int j = i+1;j<s1.length();j++){
                if(ch[j]<ch[i]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(alpha("bee"));
        String s1 = "umang";
        int a = 13;
        System.out.print(isNumber(s1));

        System.out.println("-------------");
        List<String> pos = new ArrayList<>();
        pos.add("3");
        pos.add("foo");
        pos.add("bar");
        pos.add("baz");
        System.out.println(possibleChanges(pos));
    }
}
