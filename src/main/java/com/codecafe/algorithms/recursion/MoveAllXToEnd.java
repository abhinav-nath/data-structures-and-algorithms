package com.codecafe.algorithms.recursion;

public class MoveAllXToEnd {

  public String moveAllXtoTheEnd(String input) {
    if (input.length() == 0)
      return "";

    char ch = input.toCharArray()[0];
    String result = moveAllXtoTheEnd(input.substring(1));

    if (ch == 'x')
      return result + ch;

    return ch + result;
  }

}
