package com.codecafe.algorithms.recursion;

import java.util.Arrays;

public class ReverseArray {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6};
    reverse(0, arr.length - 1, arr);
    System.out.println(Arrays.toString(arr));
  }

  private static void reverse(int l, int r, int[] arr) {
    // base condition
    if (l >= r)
      return;

    // do the small task (swap first and the last elements)
    int temp = arr[l];
    arr[l] = arr[r];
    arr[r] = temp;

    // ask recursion to handle the remaining part
    reverse(l + 1, r - 1, arr);
  }

}