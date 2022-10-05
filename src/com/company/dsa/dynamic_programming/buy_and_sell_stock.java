package com.company.dsa.dynamic_programming;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class buy_and_sell_stock {
    static int min_index(int[] a){
        int min = a[0];
        int j;
        for(int i=0;i<a.length;i++){
            if(a[i]< min){
                min = a[i];
            }
        }
        for(j=0;j<a.length;j++){
            if(min == a[j])return j;
        }
        return j;
    }
    static int max_index(int[] a, int start){
        if(start == a.length){
            return 0;
        }
        else{
            int max = a[start];
            for(int i=start;i<a.length;i++){
                if(a[i] > max) max = a[i];
            }
            return max;
        }

    }
    static int func(int[] prices){
        int min_index = min_index(prices);
        int max = max_index(prices,min_index+1);
        int res = max-prices[min_index];
        return Math.max(res, 0);
    }
    static int easy(int[] prices){
        int max = prices[1] - prices[0];
        int res = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                res = prices[j] - prices[i];
                if(res>max){
                    max = res;
                }
            }
        }
        return Math.abs(res);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] ar = br.readLine().split(",");
        int [] a = new int[ar.length];
        for(int i=0;i<ar.length;i++){
            a[i] = Integer.parseInt(ar[i]);
        }
        System.out.println(easy(a));
    }
}
