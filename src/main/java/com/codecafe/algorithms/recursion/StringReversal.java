package com.codecafe.algorithms.recursion;

public class StringReversal {

  public String reverse(String str) {

    // base case
    if ("".equals(str))
      return "";

    // What is the smallest amount of work I can do in each iteration?
    return reverse(str.substring(1)) + str.charAt(0);
  }

}
