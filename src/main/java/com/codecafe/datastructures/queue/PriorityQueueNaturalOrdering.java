package com.codecafe.datastructures.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueNaturalOrdering {

  public static void main(String[] args) {

    Queue<String> priorityQ = new PriorityQueue<>();

    priorityQ.add("abcd");
    priorityQ.add("1234");
    priorityQ.add("23bc");
    priorityQ.add("zzxx");
    priorityQ.add("abxy");

    System.out.println("Strings stored with natural ordering in the priority queue:");

    while (!priorityQ.isEmpty())
      System.out.println(priorityQ.poll());

    /*
     * poll() will give us the latest item and also remove it from the queue.
     * If we want to get the latest item in the queue without removing it, we can use the peek() function
     */

    /*
     * Since we did not tell the priority queue how to prioritize its content, it used a default natural ordering.
     * In this case, it gave us the data back in the ascending order of the strings.
     * This is not the same order in which items were added to the queue.
     */

  }

}
