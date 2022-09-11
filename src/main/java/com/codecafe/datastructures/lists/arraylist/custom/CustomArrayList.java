package com.codecafe.datastructures.lists.arraylist.custom;

import java.util.Arrays;

public class CustomArrayList<E> {

  private static final int INITIAL_CAPACITY = 10;
  private int size = 0;
  private Object elements[];

  public CustomArrayList() {
    this.elements = new Object[INITIAL_CAPACITY];
  }

  public void add(E e) {
    if (size == elements.length) {
      increaseCapacity(); // double the capacity when full
    }
    elements[size++] = e;
  }

  private void increaseCapacity() {
    int newCapacity = elements.length * 2;
    elements = Arrays.copyOf(elements, newCapacity);
  }

  @SuppressWarnings("unchecked")
  public E get(int index) {

    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    return (E) elements[index];
  }

  public Object remove(int index) {

    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    Object elementToBeRemoved = elements[index];

    for (int i = index; i < size - 1; i++) {
      elements[i] = elements[i + 1];
    }

    size--;

    return elementToBeRemoved;
  }

  public void display() {
    System.out.print("List : ");
    for (int i = 0; i < size; i++) {
      System.out.print(elements[i] + " ");
    }
  }

}