package com.codecafe.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

  public int[] sort(int[] elements) {
    int[] arr = Arrays.copyOf(elements, elements.length);
    int n = arr.length;

    for (int i = 1; i < n; i++) {
      int key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }

    System.out.println("Original:\n" + Arrays.toString(elements));
    System.out.println("Sorted:\n" + Arrays.toString(arr));
    return arr;
  }

}
