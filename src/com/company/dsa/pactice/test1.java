package com.company.dsa.pactice;

import jdk.jshell.spi.SPIResolutionException;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class BinaryNode{
    int value;
    public BinaryNode(int value){
        this.value = value;
    }
    BinaryNode leftnode;
    BinaryNode rightnode;
    int height;
}
class tree{
    BinaryNode root;
    public tree(BinaryNode node){
        this.root = node;
    }
    public void preOrder(BinaryNode node){
        if(node == null){
            return;
        }
        System.out.print(node.value + "->");
        preOrder(node.leftnode);
        preOrder(node.rightnode);
    }
    public void inOrder(BinaryNode node){
        if(node == null){
            return;
        }
        inOrder(node.leftnode);
        System.out.print(node.value + "->");
        inOrder(node.rightnode);
    }
    public void levelOrder(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode present = queue.remove();
            if(present.leftnode != null){
                queue.add(present.leftnode);
            }
            if(present.rightnode != null){
                queue.add(present.rightnode);
            }
            System.out.print(present.value + "->");
        }
    }
    public void reverseLevelorder(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode current = queue.remove();
            if(current.rightnode!=null){
                queue.add(current.rightnode);
            }
            if(current.leftnode!=null){
                queue.add(current.leftnode);
            }
            System.out.print(current.value +  "->");
        }
    }
    public void search(int value){
        boolean flag = false;
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode present = queue.remove();
            if(present.value == value){
                System.out.println(value + " is present in the tree!");
                flag = true;
            }
            else{
                if(present.leftnode != null){
                    queue.add(present.leftnode);
                }
                if(present.rightnode != null){
                    queue.add(present.rightnode);
                }
            }
        }
        if(!flag){
            System.out.println(value + " is not present in the tree");
        }
    }
    public ArrayList<Integer> spiral(){
        ArrayList<Integer> list = new ArrayList<>();
        Queue<BinaryNode> queue = new LinkedList<>();
        Stack<BinaryNode> stack = new Stack<>();
        int flag = 0;
        queue.add(root);
        stack.add(root);
        System.out.println(stack.peek().value);
        while(!stack.isEmpty()){
            BinaryNode present = queue.remove();
            list.add(present.value);
            if(present.leftnode != null){
                stack.add(present.leftnode);
                list.add(present.leftnode.value);
            }
            if(present.rightnode!=null){
                stack.add(present.rightnode);
                list.add(present.rightnode.value);
            }
            BinaryNode second = stack.pop();
            if(second.rightnode != null){
                queue.add(second.rightnode);
                list.add(second.rightnode.value);
            }
            if(second.leftnode!=null){
                queue.add(second.leftnode);
                list.add(second.leftnode.value);
            }
        }
        return list;
    }
}


public class test1 {
    public static void main(String[] args) {
        BinaryNode n1 = new BinaryNode(1);
        tree myT = new tree(n1);
        BinaryNode n2 = new BinaryNode(2);
        BinaryNode n3 = new BinaryNode(3);
        BinaryNode n4 = new BinaryNode(4);
        BinaryNode n5 = new BinaryNode(5);
        BinaryNode n6 = new BinaryNode(6);
        BinaryNode n7 = new BinaryNode(7);

        n1.leftnode = n2;
        n1.rightnode = n3;
        n2.leftnode = n4;
        n2.rightnode = n5;
        n3.leftnode = n6;
        n3.rightnode = n7;
        myT.levelOrder();
        System.out.println();
        myT.search(9);
        System.out.println("Reverse level order : ");
        myT.reverseLevelorder();
        System.out.println("-------------");
        System.out.println(myT.spiral());
        System.out.println();
    }
}
