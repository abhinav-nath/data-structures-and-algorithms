package com.codecafe.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

  public int[] sort(int[] elements) {
    int[] arr = Arrays.copyOf(elements, elements.length);
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      int minElementIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minElementIndex]) {
          minElementIndex = j;
        }
      }
      if (minElementIndex != i) {
        int temp = arr[minElementIndex];
        arr[minElementIndex] = arr[i];
        arr[i] = temp;
      }
    }

    System.out.println("Original:\n" + Arrays.toString(elements));
    System.out.println("Sorted:\n" + Arrays.toString(arr));
    return arr;
  }

}
