package com.codecafe.algorithms.sorting;

import com.codecafe.algorithms.sorting.utils.GeneralUtils;

public class BubbleSort {

  public static void main(String[] args) {
    SortingData sortingData = GeneralUtils.prepareSortingData();

    if (!sortingData.isTestMode()) {
      System.out.println("\n---------------\nRandom Numbers\n---------------");
      if (GeneralUtils.numOfElements <= 500) {
        System.out.println("Unsorted elements : ");
        for (int i = 0; i < GeneralUtils.numOfElements; i++) {
          System.out.print(sortingData.getRandomNumbers()[i] + " ");
        }
      }
      bubbleSort(sortingData.getRandomNumbers());

      if (sortingData.getBestCaseData() != null && sortingData.getBestCaseData().length > 0) {
        System.out.println("\n---------------\nBest Case\n---------------");
        if (GeneralUtils.numOfElements <= 500) {
          System.out.println("Unsorted elements : ");
          for (int i = 0; i < GeneralUtils.numOfElements; i++) {
            System.out.print(sortingData.getBestCaseData()[i] + " ");
          }
        }
        bubbleSort(sortingData.getBestCaseData());
      }

      if (sortingData.getWorstCaseData() != null && sortingData.getWorstCaseData().length > 0) {
        System.out.println("\n---------------\nWorst Case\n---------------");
        if (GeneralUtils.numOfElements <= 500) {
          System.out.println("Unsorted elements : ");
          for (int i = 0; i < GeneralUtils.numOfElements; i++) {
            System.out.print(sortingData.getWorstCaseData()[i] + " ");
          }
        }
        bubbleSort(sortingData.getWorstCaseData());
      }
    } else {
      if (sortingData.getTestDataMap() != null) {
        int c = 0;
        for (Integer key : sortingData.getTestDataMap().keySet()) {
          c++;
          System.out.printf("\nTest #%d with %d elements", c, sortingData.getTestDataMap().get(key).size());
          bubbleSort(sortingData.getTestDataMap().get(key).stream().mapToInt(i -> i).toArray());
        }
      }
    }

  }

  private static void bubbleSort(int[] elements) {
    int n = elements.length;

    long startTime = System.nanoTime();
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < n - i; j++) {
        if (elements[j - 1] > elements[j]) {
          int temp = elements[j - 1];
          elements[j - 1] = elements[j];
          elements[j] = temp;
        }
      }
    }
    long executionTime = System.nanoTime() - startTime;

    if (elements.length <= 500) {
      System.out.println("\n\nSorted elements : ");
      for (int element : elements) {
        System.out.print(element + " ");
      }
    }

    System.out.printf("\n\nExecution Time : %s nanoseconds", executionTime);
    System.out.printf("\nExecution Time : %s milliseconds\n", (float) executionTime / 1000000);
  }

}