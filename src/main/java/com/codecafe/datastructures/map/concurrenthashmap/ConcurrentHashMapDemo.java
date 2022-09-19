package com.codecafe.datastructures.map.concurrenthashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// The ConcurrentHashMap class is similar to HashMap
// except that it's thread-safe and allows modification while iteration

// https://www.journaldev.com/122/concurrenthashmap-in-java

public class ConcurrentHashMapDemo {

  public static void main(String[] args) {

    Map<String, String> myMap = new ConcurrentHashMap<>();
    myMap.put("1", "1");
    myMap.put("2", "1");
    myMap.put("3", "1");
    myMap.put("4", "1");
    myMap.put("5", "1");
    myMap.put("6", "1");

    System.out.println("ConcurrentHashMap before: " + myMap);

    for (String key : myMap.keySet()) {
      if (key.equals("3"))
        myMap.put(key + "new", "new3");
    }

    System.out.println("ConcurrentHashMap after: " + myMap);

    // HashMap
    myMap = new HashMap<>();
    myMap.put("1", "1");
    myMap.put("2", "1");
    myMap.put("3", "1");
    myMap.put("4", "1");
    myMap.put("5", "1");
    myMap.put("6", "1");

    System.out.println("HashMap before: " + myMap);

    for (String key : myMap.keySet()) {
      if (key.equals("3"))
        myMap.put(key + "new", "new3"); // ConcurrentModificationException
    }

    System.out.println("HashMap after: " + myMap);
  }

}
