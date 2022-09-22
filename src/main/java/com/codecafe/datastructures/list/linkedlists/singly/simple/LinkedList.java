package com.codecafe.datastructures.list.linkedlists.singly.simple;

public class LinkedList {

  private Node head;

  public void add(int data) {
    if (this.head == null) {
      this.head = new Node(data, null);
    } else {
      Node end = this.head;

      while (end.getNext() != null) {
        end = end.getNext();
      }

      end.setNext(new Node(data, null));
    }
  }

  public void addToFront(int data) {
    this.head = new Node(data, this.head);
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
