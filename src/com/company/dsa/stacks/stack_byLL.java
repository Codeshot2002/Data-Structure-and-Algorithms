package com.company.dsa.stacks;

public class stack_byLL {
    Linked_list mylist = new Linked_list();
    public void createStack(int data){
        mylist.create_singly_linked_list(data);
    }
    public void push(int data){
        if(mylist.size<1){
            System.out.println("Create a stack first!");
        }
        else{
            mylist.insert(data, mylist.size);
        }
    }
    public void pop(){
        if(mylist.size<1){
            System.out.println("Stack is empty");
        }
        else{
            mylist.delete_node(mylist.size-1);
        }
    }
    public void peek(){
        if(mylist.head == null){
            System.out.println("Create a linked list first!");
        }
        else{
            Node node = mylist.head;
            for(int i=0; i<mylist.size;i++){
                System.out.println(node.data);
                node = node.next;
            }
        }
    }

    public static void main(String[] args) {
        stack_byLL my_stack = new stack_byLL();
        my_stack.createStack(1);
        my_stack.push(2);
        my_stack.push(3);
        my_stack.push(4);
        my_stack.pop();
        my_stack.peek();
    }
}
