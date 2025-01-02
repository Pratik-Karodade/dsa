package com.company;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(2);
        list.append(3);
//        list.getHead();
//        list.getTail();
//        list.getLength();
        list.printLinkedList();
        System.out.println("------------");
//        System.out.println("removing last : "+list.removeLast().value);
//        list.printLinkedList();
//        System.out.println("removing last : "+list.removeLast().value);
//        list.printLinkedList();
//        System.out.println("removing last : "+list.removeLast());
        list.prepend(1);
        list.printLinkedList();
        System.out.println("------------");

        list.append(4);
        list.printLinkedList();
    }
}
