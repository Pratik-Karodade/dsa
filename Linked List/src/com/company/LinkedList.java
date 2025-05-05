package com.company;
// we can interact with linkedList only with the help of head and tail.
public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else {
            tail.next=newNode; // yat apn tailcha value wala node newNode la connect krt ahe
            tail=newNode; // yat apn newNode la tail lavat ahe
        }
        length++;
    }

    public Node removeLast(){
        if(length==0){
            return null;
        }
        Node temp=head;
        Node pre = head;
        while(temp.next!=null){
            pre=temp;
            temp = temp.next;
        }
        tail=pre;
        tail.next=null;
        length--;
        /* we are checking this again bcoz in case of LL length =1 tail initially points to null.
            it will just reduce the length but not the node and Node will be as it is.
         */
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else {
            newNode.next=head;
            head=newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        head = temp.next;
        temp.next=null;
        length--;
        if(length==0){
            tail=null;
        }
        return temp;
    }

    public Node getNode(int index){
        if(index<0 || index>=length){
            return null;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=head.next;
        }
        return temp;
    }
    public void getHead() {
        System.out.println("Head is : " + head.value);
    }

    public void getTail(){
        System.out.println("Tail is : "+tail.value);
    }

    public void getLength(){
        System.out.println("lenght : "+length);
    }
}
