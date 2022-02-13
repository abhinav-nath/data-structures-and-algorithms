package com.codecafe.ds.lists.linkedlists.singly.simple;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addToFront(10);
        linkedList.addToFront(20);
        linkedList.addToFront(30);
        linkedList.addToFront(40);
        linkedList.addToFront(50);

        linkedList.printList();
        linkedList.findLastElement();
    }

}