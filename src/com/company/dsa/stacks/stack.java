package com.company.dsa.stacks;
class my_stack{
    private int[] array;
    private int top;
    public void createStack(int size){
        this.array = new int[size];
        top = -1;
        System.out.println("Stack of size " + size + " has been created!");
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        if(array.length -1 == top){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(int data){
        if(isFull()){
            System.out.println("stack is full!");
        }
        else{
          top++;
            this.array[top] = data;
            System.out.println(data + " has been added to your stack");
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
        }
        else{
            int topItem = array[top];
            array[top] = 0;
            top--;
            System.out.println(topItem + " has been removed!");
        }
    }
    public void peek(){
        for(int i=0;i<=top;i++){
            System.out.println(array[i]);
        }
    }
}
public class stack {
    public static void main(String[] args) {
        my_stack stack = new my_stack();
        stack.createStack(5);
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.peek();
    }
}
