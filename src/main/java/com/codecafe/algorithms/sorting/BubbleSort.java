package com.codecafe.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

  public int[] sort(int[] elements) {
    int[] arr = Arrays.copyOf(elements, elements.length);
    int n = arr.length;

    for (int i = 0; i < n; i++) {
      for (int j = 1; j < n - i; j++) {
        if (arr[j - 1] > arr[j]) {
          int temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        }
      }
    }

    System.out.println("Original:\n" + Arrays.toString(elements));
    System.out.println("Sorted:\n" + Arrays.toString(arr));
    return arr;
  }

}
