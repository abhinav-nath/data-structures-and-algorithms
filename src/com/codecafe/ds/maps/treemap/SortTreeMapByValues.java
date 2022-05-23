package com.codecafe.ds.maps.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortTreeMapByValues {

  public static void main(String[] args) {

    Map<String, Integer> treeMap = new TreeMap<>();

    // map of fruit-price
    treeMap.put("Apple", 20);
    treeMap.put("Mango", 42);
    treeMap.put("Banana", 33);
    treeMap.put("Watermelon", 50);
    treeMap.put("Kiwi", 100);

    // a TreeMap is sorted by Keys by default
    System.out.println(treeMap);

    Map<String, Integer> sortedTreeMap = valueSort(treeMap);

    // sorted by values
    System.out.println(sortedTreeMap);

  }

  public static <K, V extends Comparable<V>> Map<K, V> valueSort(final Map<K, V> map) {
    // static method with return type Map and
    // extending comparator class which compares values
    // associated with two keys
    Comparator<K> valueComparator = (k1, k2) -> {

      int comp = map.get(k1).compareTo(map.get(k2));

      if (comp == 0)
        return 1;

      else
        return comp;
    };

    // Sorted Map created using the comparator
    Map<K, V> sorted = new TreeMap<>(valueComparator);

    sorted.putAll(map);

    return sorted;
  }

}