package com.codecafe.datastructures.list.arraylist.custom;

public class CustomArrayListDemo {

  public static void main(String[] args) {
    CustomArrayList<Integer> list = new CustomArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    list.add(10);
    list.add(11);

    list.display();
    System.out.println("\nlist.get(1)" + " : " + list.get(1));

    System.out.println("element removed from index 1" + " : " + list.remove(1));

    list.display();
  }

}
