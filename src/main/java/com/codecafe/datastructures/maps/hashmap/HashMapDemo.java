package com.codecafe.datastructures.maps.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

  public static void main(String[] args) {

    Map<Key, Integer> map = new HashMap<>();

    map.put(new Key("apple"), 10);
    map.put(new Key("google"), 20);
    map.put(new Key("amazon"), 30);

    // hash codes for apple and amazon will be same

    System.out.println();
    System.out.println("Value for apple : " + map.get(new Key("apple")));
    System.out.println("Value for amazon : " + map.get(new Key("amazon")));

  }

}