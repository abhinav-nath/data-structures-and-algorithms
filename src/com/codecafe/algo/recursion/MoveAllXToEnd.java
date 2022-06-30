package com.codecafe.algo.recursion;

public class MoveAllXToEnd {

  public static void main(String[] args) {
    String input = "axxbcxexfgxxhixj";
    System.out.println(moveAllXtoTheEnd(input));
  }

  private static String moveAllXtoTheEnd(String input) {
    if (input.length() == 0)
      return "";

    char ch = input.toCharArray()[0];
    String result = moveAllXtoTheEnd(input.substring(1));

    if (ch == 'x')
      return result + ch;

    return ch + result;
  }

}
