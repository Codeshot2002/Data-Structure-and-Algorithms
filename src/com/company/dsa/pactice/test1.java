package com.company.dsa.pactice;
class binarytree{
    int[] array;
    int lastIndex;
    public void create(int size){
        array = new int[size];
        lastIndex = -1;
    }
    public boolean isFull(){
        if(array.length-1 == lastIndex){
            return true;
        }
        else{
            return false;
        }
    }
    public void Insert(int data){
        if(!isFull()){
            array[lastIndex + 1] = data;
            System.out.println(data + " has been added to the tree");
            lastIndex++;
        }
        else{
            System.out.println("Create a binary tree first");
        }
    }
    public void printTree(){

    }
}
public class test1 {
    public static void main(String[] args) {

    }
}
