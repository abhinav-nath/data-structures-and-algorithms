package com.codecafe.datastructures.list.linkedlists.singly.simple;

public class Node {

  private final int data;
  private Node next;

  public Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  public int getData() {
    return data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node node) {
    this.next = node;
  }

  @Override
  public String toString() {
    return Integer.toString(this.data);
  }

}
