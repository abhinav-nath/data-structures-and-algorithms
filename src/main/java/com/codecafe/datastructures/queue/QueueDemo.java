package com.codecafe.datastructures.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Queue supports three operations:
 * 1. Add: Add an item into the end of the queue.
 * 2. Peek: Look at the first item of the queue.
 * 3. Remove: Remove the first item of the queue.
 */

public class QueueDemo {

  public static List<Integer> execute(List<String> instructions) {
    // initialize the queue
    ArrayList<Integer> queue = new ArrayList<>();

    for (String instruction : instructions) {
      switch (instruction) {
        case "peek" ->
          // print out the first item in queue
          System.out.println("peek: " + queue.get(0));
        case "remove" -> {
          System.out.println("remove: " + queue.get(0));
          // remove the first item in queue
          queue.remove(0);
        }
        default -> {
          // get the data in the "add" instruction
          int data = Integer.parseInt(instruction.substring(4));
          System.out.println("add: " + data);
          // add data to the end of queue
          queue.add(data);
        }
      }
    }
    return queue;
  }

  public static void main(String[] args) {
    List<String> instructions = List.of("add 1", "add 2", "add 3", "peek", "remove", "peek", "add 4", "peek");
    List<Integer> res = execute(instructions);
    System.out.println("Queue: " + res.stream().map(String::valueOf).collect(Collectors.joining(" ")));
  }

}
