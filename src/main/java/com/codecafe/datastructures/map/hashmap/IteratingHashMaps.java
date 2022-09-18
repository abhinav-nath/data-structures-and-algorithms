package com.codecafe.datastructures.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratingHashMaps {

  public static void main(String[] args) {

    Map<String, Integer> map = new HashMap<>();
    map.put("Tom", 29);
    map.put("Bill", 33);
    map.put("Stacy", 30);
    map.put("Tori", 32);
    map.put("Jack", 35);

    // using keySet() for iteration over keys
    System.out.println("Keys:");
    Set<String> keySet = map.keySet();
    for (String key : keySet)
      System.out.println(key);

    // Iterating over keys and searching for values (inefficient)
    System.out.println("\nValues:");
    for (String key : keySet)
      System.out.println(map.get(key));

    // using values() for iteration over keys
    System.out.println("\nValues:");
    for (int value : map.values())
      System.out.println(value);

    // using iteration over Map.entrySet()
    System.out.println("\nKeys and Values:");
    for (Map.Entry<String, Integer> entry : map.entrySet())
      System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

    // using iterators
    Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();

    System.out.println("\nKeys and Values using iterator:");
    while (itr.hasNext()) {
      Map.Entry<String, Integer> entry = itr.next();
      System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    }

    // using lambda to iterate map
    System.out.println("\nKeys and Values using lambda:");
    map.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));
  }

}
