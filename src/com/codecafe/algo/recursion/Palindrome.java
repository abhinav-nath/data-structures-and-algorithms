package com.codecafe.algo.recursion;

public class Palindrome {

  public static void main(String[] args) {
    String s = "racecar";
    System.out.println(isPalindrome(0, s.length() - 1, s));
  }

  private static boolean isPalindrome(int l, int r, String s) {
    if (l >= r)
      return true;

    if (s.charAt(l) != s.charAt(r))
      return false;

    return isPalindrome(l + 1, r - 1, s);
  }

}