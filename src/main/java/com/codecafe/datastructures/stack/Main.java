package com.codecafe.datastructures.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class StackDemo {

  public static List<Integer> execute(List<String> instructions) {
    // initialize the stack
    ArrayList<Integer> stack = new ArrayList<>();

    for (String instruction : instructions) {
      switch (instruction) {
        case "peek" ->
          // print out the top item in stack
          System.out.println("peek: " + stack.get(stack.size() - 1));
        case "pop" -> {
          System.out.println("pop: " + stack.get(stack.size() - 1));
          // pop the top item in stack
          stack.remove(stack.size() - 1);
        }
        default -> {
          // get the data in the "push" instruction
          int data = Integer.parseInt(instruction.substring(5));
          System.out.println("push: " + data);
          // push data to the top of stack
          stack.add(data);
        }
      }
    }
    return stack;
  }

  public static void main(String[] args) {
    List<String> instructions = List.of("push 1", "push 2", "peek", "push 3", "peek", "pop", "push 4", "peek");
    List<Integer> res = execute(instructions);
    System.out.println("Stack: " + res.stream().map(String::valueOf).collect(Collectors.joining(" ")));
  }

}
