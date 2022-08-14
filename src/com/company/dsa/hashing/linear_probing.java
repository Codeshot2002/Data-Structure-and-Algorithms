package com.company.dsa.hashing;

import java.util.ArrayList;

class linearProbing{
    String[] hashtable;
    int lastusedindex;

    linearProbing(int size){
        hashtable = new String[size];
        lastusedindex = 0;
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

    public double getloadfactor(){
        double loadfactor = lastusedindex * 1.0/hashtable.length;
        return loadfactor;
    }

    public void rehashKeys(String word){
        lastusedindex = 0;
        ArrayList<String> data = new ArrayList<String>();
        for(String s : hashtable){
            data.add(s);
        }
        data.add(word);
        hashtable = new String[hashtable.length * 2];
        for(String a : data){
            insertInHashtable(a);
        }
    }
    public void insertInHashtable(String word){
        double loadfactor = getloadfactor();
        if(loadfactor>=0.75){
            rehashKeys(word);
        }else{
            int index = modASCII(word,hashtable.length);
            for(int i=index;i<index + hashtable.length;i++){
                int newIndex = i % hashtable.length;
                if(hashtable[newIndex] == null){
                    hashtable[newIndex] = word;
                    System.out.println(word + " is successfully inserted at " + newIndex);
                    break;
                }else{
                    System.out.println(newIndex + " is already occupied, try new empty cell");
                }
            }
        }
        lastusedindex++;
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

    public boolean search(String word){
        int index = modASCII(word,hashtable.length);
        for(int i = index;i<index + hashtable.length;i++){
            int newIndex = i% hashtable.length;
            if(hashtable[newIndex] != null && hashtable[newIndex].equalsIgnoreCase(word)){
                System.out.println(word + " found at location " + newIndex);
                return true;
            }
        }
        return false;
    }

    public void delete(String word){
        int index = modASCII(word,hashtable.length);
        for(int i = index;i<index + hashtable.length;i++){
            int newIndex = i% hashtable.length;
            if(hashtable[newIndex] != null && hashtable[newIndex].equalsIgnoreCase(word)){
                hashtable[newIndex] = null;
                System.out.println(word + " has been deleted");
                return;
            }
        }
        System.out.println(word + " does not exist in the table");
    }
}
public class linear_probing {
    public static void main(String[] args) {
        linearProbing linearProbing = new linearProbing(6);
        linearProbing.insertInHashtable("Umang");
        linearProbing.insertInHashtable("ipsit");
        linearProbing.insertInHashtable("manoj");
        linearProbing.insertInHashtable("rashmi");
        linearProbing.insertInHashtable("sonia");
        linearProbing.DisplayHashTable();
        linearProbing.search("sonia");
    }
}
