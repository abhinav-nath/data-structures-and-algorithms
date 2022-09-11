package com.codecafe.algorithms.recursion;

public class BasicRecursion1 {

  public static void main(String[] args) {
    sayHello(5);
  }

  private static void sayHello(int count) {
    if (count == 0)
      return;

    System.out.println("hello");

    sayHello(count - 1);
  }

}

/*
  Output:

  hello
  hello
  hello
  hello
  hello
*/