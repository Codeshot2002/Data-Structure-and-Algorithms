package com.company.dsa.pactice;

public class time_conversion {
    public static String timeConversion(String s) {
        String time = s.substring(0,2);
        String format = s.substring(8,10);
        int tame = Integer.parseInt(time);
        if(format.equalsIgnoreCase("pm")){
            tame+=12;
        }
        else{
            return s.substring(0,s.length()-2);
        }
        String fin = Integer.toString(tame);
        return fin+= s.substring(2,s.length()-2);
    }

    public static void main(String[] args) {
        String time = "07:05:45PM";
        System.out.println(timeConversion(time));
    }
}
