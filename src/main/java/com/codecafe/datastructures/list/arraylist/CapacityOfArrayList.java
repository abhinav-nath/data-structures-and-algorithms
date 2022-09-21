package com.codecafe.datastructures.list.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class CapacityOfArrayList {

  public static void main(String[] args) throws Exception {
    System.out.println("list 1");
    ArrayList<String> list1 = new ArrayList<>();
    getCapacity(list1);
    list1.add("apple");
    getCapacity(list1);

    System.out.println("\nlist2");
    ArrayList<String> list2 = new ArrayList<>(5);
    getCapacity(list2);
    list2.add("apple");
    list2.add("mango");
    list2.add("pineapple");
    list2.add("watermelon");
    list2.add("strawberry");
    getCapacity(list2);
    list2.add("banana");
    getCapacity(list2);

    System.out.println("\nlist3");
    ArrayList<String> list3 = new ArrayList<>();
    getCapacity(list3);
    list3.add("string1");
    list3.add("string2");
    list3.add("string3");
    list3.add("string4");
    list3.add("string5");
    list3.add("string6");
    list3.add("string7");
    list3.add("string8");
    list3.add("string9");
    list3.add("string10");
    list3.add("string11");
    getCapacity(list3);
    list3.trimToSize();
    getCapacity(list3);
  }

  // get the capacity of the backing array using reflection
  static void getCapacity(ArrayList<?> l) throws Exception {
    Field dataField = ArrayList.class.getDeclaredField("elementData");
    dataField.setAccessible(true);
    System.out.format("Size: %2d, Capacity: %2d%n", l.size(), ((Object[]) dataField.get(l)).length);
  }

}
