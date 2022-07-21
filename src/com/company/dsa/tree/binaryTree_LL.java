package com.company.dsa.tree;

import java.util.LinkedList;
import java.util.Queue;

class BinaryNode{
    BinaryNode (String value){
        this.value = value;
    }
    public String value;
    public BinaryNode leftNode;
    public BinaryNode rightNode;
    public int height;
}
public class binaryTree_LL {
    BinaryNode root;
    public binaryTree_LL(BinaryNode node){
        this.root = node;
    }
    public void preOrder(BinaryNode node){
        if(node == null){
            return;
        }
        System.out.print(node.value + "->");
        preOrder(node.leftNode);
        preOrder(node.rightNode);
    }
    public void inOrder(BinaryNode node){
        if(node == null){
            return;
        }
        inOrder(node.leftNode);
        System.out.print(node.value + "->");
        inOrder(node.rightNode);
    }
    public void postOrder(BinaryNode node){
        if(node == null){
            return;
        }
        postOrder(node.leftNode);
        postOrder(node.rightNode);
        System.out.print(node.value + "->");
    }
    public void levelOrder(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();

            if(presentNode.leftNode != null){
                queue.add(presentNode.leftNode);
            }
            if(presentNode.rightNode != null){
                queue.add(presentNode.rightNode);
            }
            System.out.print(presentNode.value +  "->");
        }
    }
    public void insertNode(BinaryNode node){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove(); //takes it to the next level
            if(presentNode.leftNode == null){
                presentNode.leftNode = node;
                System.out.println(node.value + " has been added to the tree at " + presentNode.value +  " node");
                return;
            }
            else{
                queue.add(presentNode.leftNode);
            }
            if(presentNode.rightNode == null){
                presentNode.rightNode = node;
                System.out.println(node.value + " has been added to the tree at " + presentNode.value +  " node");
                return;
            }else{
                queue.add(presentNode.rightNode);
            }
        }
    }
    public void search(String data) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value.equalsIgnoreCase(data)) {
                System.out.println(data + " exists in the binary tree!");
                return;
            }
            else {
                if (presentNode.leftNode != null) {
                    queue.add(presentNode.leftNode);
                }
                if (presentNode.rightNode != null) {
                    queue.add(presentNode.rightNode);
                }
            }
        }
        System.out.print(data + " does not exists!");
    }
    public void delete_tree(){
        this.root = null;
        System.out.println("Binary tree has been deleted!");
    }

    public static void main(String[] args) {
        BinaryNode n1 = new BinaryNode("n1");
        binaryTree_LL myTree = new binaryTree_LL(n1);
        BinaryNode n2 = new BinaryNode("n2");
        BinaryNode n3 = new BinaryNode("n3");
        BinaryNode n4 = new BinaryNode("n4");
        BinaryNode n5 = new BinaryNode("n5");
        BinaryNode n6 = new BinaryNode("n6");
        BinaryNode n7 = new BinaryNode("n7");
        BinaryNode n8 = new BinaryNode("n8");
        BinaryNode n9 = new BinaryNode("n9");

        n1.leftNode = n2;
        n1.rightNode = n3;
        n2.leftNode = n4;
        n2.rightNode = n5;
        n4.leftNode = n8;
        n4.rightNode = n9;
        n3.leftNode = n6;
        n3.rightNode = n7;

        //traversing and searching
        System.out.print("Pre order : ");myTree.preOrder( n1);
        System.out.println();
        System.out.print("In order : ");myTree.inOrder( n1);
        System.out.println();
        System.out.print("Post order : ");myTree.postOrder( n1);
        System.out.println();
        System.out.print("Level order : ");myTree.levelOrder();
        System.out.println();
        myTree.search("n9");

        //adding a node
        BinaryNode n10 = new BinaryNode("n10");
        BinaryNode n11 = new BinaryNode("n11");
        myTree.insertNode(n10);
        myTree.insertNode(n11);
        //start from video 15
    }
}
