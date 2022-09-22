package com.codecafe.datastructures.list.linkedlists.singly.simple;

public class LinkedListDemo {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.addToFront(10);
    linkedList.printList();
    linkedList.addToFront(20);
    linkedList.printList();
    linkedList.addToFront(30);
    linkedList.printList();
    linkedList.addToFront(40);
    linkedList.printList();
    linkedList.addToFront(50);
    linkedList.printList();
    linkedList.findLastElement();

    linkedList.add(99);
    linkedList.printList();
  }

}
