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
    public void preOrder(int index){
        if(index>lastUserIndex){
            return;
        }
        System.out.print(array[index] + "->");
        preOrder(index * 2);
        preOrder(index  * 2 + 1);
    }
    public void inOrder(int index){
        if(index>lastUserIndex){
            return;
        }
        inOrder(index*2);
        System.out.print(array[index] + "->");
        inOrder(index * 2 + 1);

    }
    public void postOrder(int index){
        if(index>lastUserIndex){
            return;
        }
        postOrder(index*2);
        postOrder(index*2 + 1);
        System.out.print(array[index] + "->");
    }
    public void levelOrder(int index){
        if(index>lastUserIndex){
            return;
        }
        for(int i=0;i<=lastUserIndex;i++){
            System.out.print(array[i] + "->");
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
        binarytree.insertNode("8");
        binarytree.insertNode("9");
        binarytree.preOrder(1);
        System.out.println();
        binarytree.inOrder(1);
        System.out.println();
        binarytree.postOrder(1);
        System.out.println();
        binarytree.levelOrder(1);
    }
}
