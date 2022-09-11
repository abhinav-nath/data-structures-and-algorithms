package com.codecafe.algorithms.recursion;

public class StringReversal {

  public static void main(String[] args) {
    String str = "hello";
    System.out.println(reverse(str));
  }

  private static String reverse(String str) {

    // base case
    if ("".equals(str))
      return "";

    // What is the smallest amount of work I can do in each iteration?
    return reverse(str.substring(1)) + str.charAt(0);
  }

}