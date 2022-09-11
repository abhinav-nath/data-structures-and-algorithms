package com.codecafe.algorithms.searching;

import java.util.Arrays;

public class BinarySearch {

  public int search(int[] arr, int elementToSearch) {
    // binary search requires a sorted array
    Arrays.sort(arr);

    int l = 0;
    int r = arr.length - 1;

    int m = (l + r) / 2;

    while (l <= r) {
      if (arr[m] < elementToSearch) {
        l = m + 1;
      } else if (arr[m] == elementToSearch) {
        return m; // element found at index m
      } else {
        r = m - 1;
      }

      m = (l + r) / 2;
    }

    return -1;
  }

}
