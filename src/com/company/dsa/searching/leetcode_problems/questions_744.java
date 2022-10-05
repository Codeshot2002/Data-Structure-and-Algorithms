package com.company.dsa.searching.leetcode_problems;
//leetcode problem "Find the smallest letter greater than target"
public class questions_744 {
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target< letters[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }

    public static void main(String[] args) {
        char[] letters = {'c','c','f','f','j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters,target));
    }
}
