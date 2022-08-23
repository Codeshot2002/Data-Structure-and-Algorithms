package com.company.dsa.greedyAlgo;

import java.util.ArrayList;
import java.util.Collections;

public class coin_change_problem {
    public static ArrayList<Integer> coinChange(ArrayList<Integer> coins,int amount){
        Collections.sort(coins);
        int high = coins.size()-1;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=high;i>=0;i--){
            while(coins.get(i) <= amount){
                result.add(coins.get(i));
                amount = amount-coins.get(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> coins = new ArrayList<>();
        coins.add(1);coins.add(2);coins.add(5);coins.add(10);coins.add(20);coins.add(50);coins.add(100);coins.add(500);coins.add(2000);
        System.out.println(coinChange(coins,1312));
    }
}
