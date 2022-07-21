package com.company.dsa.queue;
class my_queue{
    int top;
    int start;
    int[] arr;
    public boolean isEmpty(){
        if(top == -1 || start > top){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        if(arr.length == top){
            return true;
        }
        else{
            return false;
        }
    }
    public void createQueue(int size){
        this.arr = new int[size];
        top = 0;
        start = 0;
        System.out.println("A queue has been created!");
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Your queue is full!");
        }
        else{
            if((start & top) == -1){
                start = top = 0;
            }
            arr[top] = data;
            top++;
            System.out.println(data + " has been added to the queue!");
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Already empty!");
        }
        else{
            int start_item = arr[start];
            start++;
            if(start>=top){
                top = start = -1;
            }
            System.out.println("This is removed : " + start_item);
        }
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("it is empty");
        }
        else{
            System.out.println("First item is : " + arr[start]);
        }
    }
}
public class Queue {
    public static void main(String[] args) {
        my_queue queue = new my_queue();
        queue.createQueue(4);
        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.peek();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.peek();
        queue.enqueue(69);
        queue.dequeue();
        queue.peek();
    }
}
