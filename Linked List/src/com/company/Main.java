package com.company;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.printLinkedList();
        System.out.println("------");
        System.out.println(list.getNode(-1)); ;
    }
}
