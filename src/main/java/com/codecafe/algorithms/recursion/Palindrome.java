package com.codecafe.algorithms.recursion;

public class Palindrome {

  /*
    l = 0
    r = s.length() - 1;
   */
  public boolean isPalindrome(int l, int r, String s) {
    if (l >= r)
      return true;

    if (s.charAt(l) != s.charAt(r))
      return false;

    return isPalindrome(l + 1, r - 1, s);
  }

}
