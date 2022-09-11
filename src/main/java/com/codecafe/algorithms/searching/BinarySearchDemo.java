package com.codecafe.algorithms.searching;

import java.util.Arrays;

public class BinarySearchDemo {

  public static void main(String[] args) {
    int[] arr = {20, 10, 80, 70, 60, 50, 40, 30, 90, 100};

    // binary search requires a sorted array
    Arrays.sort(arr);

    System.out.println("Array after sorting:\n" + Arrays.toString(arr));

    int elementToSearch = 30;

    binarySearch(arr, elementToSearch);
  }

  private static void binarySearch(int[] arr, int elementToSearch) {
    int l = 0;
    int r = arr.length - 1;

    int m = (l + r) / 2;

    while (l <= r) {
      if (arr[m] < elementToSearch) {
        l = m + 1;
      } else if (arr[m] == elementToSearch) {
        System.out.println("Element found at position : " + (m + 1));
        break;
      } else {
        r = m - 1;
      }

      m = (l + r) / 2;
    }

    if (l > r)
      System.out.println("Element not found");
  }

}