package com.company.dsa.tree;

public class Binarytree_array {
    String[] array;
    int lastUserIndex;
    public void createBinaryTree(int size){
        array = new String[size+1];
        lastUserIndex = 0;
        System.out.println("Binary tree of size " + size + " has been created!");
    }
    public boolean isFull(){
        if(array.length-1 == lastUserIndex){
            return true;
        }
        else{
            return false;
        }
    }
    public void insertNode(String data){
        if(!isFull()){
            array[lastUserIndex + 1] = data;
            if(lastUserIndex==0){
                System.out.println("Root node is " + data);
                lastUserIndex++;
            }
            else{
                lastUserIndex++;
                int indexOfParent = lastUserIndex/2;
                System.out.println(data +  " has been added to the binary tree at " + array[indexOfParent] + " node");
            }
        }
    }

    public static void main(String[] args) {
        Binarytree_array binarytree = new Binarytree_array();
        binarytree.createBinaryTree(10);
        binarytree.insertNode("1");
        binarytree.insertNode("2");
        binarytree.insertNode("3");
        binarytree.insertNode("4");
        binarytree.insertNode("5");
        binarytree.insertNode("6");
        binarytree.insertNode("7");
    }
}
