package com.codecafe.ds.lists.linkedlists.singly.simple;

public class LinkedList {

    private Node head;

    public void addToFront(int data) {
        Node node = new Node();
        node.setData(data);
        node.setNext(this.head);
        this.head = node;
    }

    public void printList() {
        Node current = this.head;
        System.out.print("HEAD -> ");

        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }

        System.out.println("null");
    }

    // find last element
    public void findLastElement() {
        Node current = this.head;

        while (current.getNext() != null)
            current = current.getNext();

        System.out.println("last element is : " + current.getData());
    }

}