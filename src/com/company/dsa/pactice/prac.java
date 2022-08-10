package com.company.dsa.pactice;

public class prac {
    public static void main(String[] args) {

        int[] ar = {1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20,21,55};
        int target = 74;
        long start = System.currentTimeMillis();
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i] + ar[j] == target){
                    System.out.println("nested loop ; "+i+", " + j);
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        int i=0,j = i+1;
        while(true) {
            if (j != ar.length) {
                if (ar[i] + ar[j] == target) {
                    System.out.println("while loop : " + i + ", " + j);
                }
                j++;
            } else if (i == ar.length - 1) {
                break;
            } else {
                i++;
                j = i + 1;
            }
        }
    }
}
