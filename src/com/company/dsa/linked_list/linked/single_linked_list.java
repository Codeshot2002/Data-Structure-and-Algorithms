package com.company.dsa.linked_list.linked;

class Node{
    public int data;
    public Node next;
}
class Linked_list{
    public Node head;
    public Node tail;
    public int size;
    public Node create_singly_linked_list(int data) {
        head = new Node();
        Node node = new Node();
        node.data = data;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    public void insert(int data, int location){
        Node node = new Node();
        node.data = data;
        if(head==null){
            create_singly_linked_list(data);
        }
        else if(location==0){
            node.next = head;
            head = node;
        }
        else if(location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        }
        else{
            Node tempnode = head;
            for(int index = 0;index<location-1;index++){
                tempnode = tempnode.next;
            }
            Node nextnode = tempnode.next;
            tempnode.next = node;
            node.next = nextnode;
        }
        size++;
    }
    public void printall(){
        if(head == null){
            System.out.println("Create a linked list first!");
        }
        else{
            Node node = head;
            for(int i=0; i<size-1;i++){
                System.out.print(node.data);
                if(i < size - 2){
                    System.out.print("->");
                }
                node = node.next;
            }
        }
    }
    public boolean search(int item){
        boolean flag = false;
        Node temp = head;
        for(int i=0;i<size-1;i++){
            if(temp.data == item){
                flag = true;
            }
            temp = temp.next;
        }
        return flag;
    }
    public void delete_node(int location){
        Node tempnext = head;
        Node tempprev = head;
        if(head==null){
            System.out.println("create a linked list first!");
        }
        else if(location==0){
            head = head.next;
            size--;
        }
        else if(location < size && location > 0){
            for(int i=0;i<location-1;i++){
                tempprev = tempprev.next;
            }
            for(int j=0;j<location;j++){
                tempnext = tempnext.next;
            }
            tempprev.next = tempnext.next;
            size--;
        }
    }
    public void delete_all(){
        head = null;
        tail = null;
    }
}

public class single_linked_list {
    public static void main(String[] args) {
        Linked_list mylist = new Linked_list();
        mylist.insert(1,0);
        System.out.println();
        mylist.insert(2,1);
        System.out.println();
        mylist.insert(3,2);
        System.out.println();
        mylist.insert(4,3);
        System.out.println();
        mylist.insert(5,4);
        System.out.println();
        mylist.insert(6, 5);
        mylist.delete_node(0);
        System.out.println();
        mylist.insert(10,0);
        System.out.println();
        System.out.println(mylist.search(7));
        mylist.delete_all();
        mylist.printall();
    }
}
