package com.company.dsa.hashing;

import java.util.LinkedList;

class DirectChaining{
    LinkedList<String>[] hashtable;
    int max = 5;

    public DirectChaining(int size){
        hashtable = new LinkedList[size];
    }

    public int modASCII(String word, int M){
        char ch[];
        ch = word.toCharArray();
        int sum = 0;
        for(int i=0;i<word.length();i++){
            sum += ch[i];
        }
        return sum%M;
    }

    public void insertHashTable(String word){
        int index = modASCII(word,hashtable.length);
        if(hashtable[index] == null){
            hashtable[index] = new LinkedList<String>();
            hashtable[index].add(word);
        }else{
            hashtable[index].add(word);
        }
    }

    public void DisplayHashTable(){
        if(hashtable == null){
            System.out.println("\nHashtable does not exist!");
        }
        else{
            System.out.println("\n-------------HASHTABLE--------------");
            for(int i=0;i<hashtable.length;i++){
                System.out.println("Index : " + i + ", key : " + hashtable[i]);
            }
        }
    }
}
public class direct_chaining {
    public static void main(String[] args) {
        DirectChaining directChaining = new DirectChaining(1);
        directChaining.insertHashTable("Umang");
        directChaining.insertHashTable("Ipsit");
        directChaining.insertHashTable("Rashmi");
        directChaining.insertHashTable("Sonia");
        directChaining.insertHashTable("Maneesh");
        directChaining.DisplayHashTable();
    }
}
