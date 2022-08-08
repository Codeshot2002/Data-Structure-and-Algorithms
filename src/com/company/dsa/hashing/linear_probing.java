package com.company.dsa.hashing;

import java.util.ArrayList;

class linearProbing{
    String[] hashtable;
    int usedCellNumber;
    linearProbing(int size){
        hashtable = new String[size];
        usedCellNumber = 0;
    }

    public int modASCII(String word, int M){
        char[] ch;
        ch = word.toCharArray();
        int sum = 0;
        for(int i=0;i<word.length();i++){
            sum += ch[i];
        }
        return sum%M;
    }

    public double getLoadFactor(){
        double loadfactor =  usedCellNumber * 1.0/hashtable.length;
        return loadfactor;
    }

    public void rehashKeys(String word){
        usedCellNumber = 0;
        ArrayList<String> data = new ArrayList<>();
        for(String s : hashtable){
            if(s!=null) {
                data.add(s);
            }
        }
        data.add(word);
        hashtable = new String[hashtable.length * 2];
        for(String a : data){
            insertInHashtable(a);
        }
    }
    public void insertInHashtable(String word){
        double loadFactor = getLoadFactor();
        if(loadFactor >= 0.75){
            rehashKeys(word);
        }
        else{
            int index = modASCII(word,hashtable.length);
            for(int i = index;i<hashtable.length;i++){
                int newIndex = i % hashtable.length;
                if(hashtable[newIndex] == null){
                    hashtable[newIndex] = word;
                    System.out.println("Successfully inserted " + word + " at location " + newIndex);
                    break;
                }else{
                    System.out.println( newIndex+" Index is already occupied, moving " + word + " to the next location");
                }
            }
        }
        usedCellNumber ++;
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
public class linear_probing {
    public static void main(String[] args) {
        linearProbing obj = new linearProbing(12);
        obj.insertInHashtable("Umang");
        obj.insertInHashtable("Maneesh");
        obj.insertInHashtable("Vansh");
        obj.insertInHashtable("Abhi");
        obj.insertInHashtable("Ujjwal");
        obj.DisplayHashTable();

        System.out.println("");
    }
}