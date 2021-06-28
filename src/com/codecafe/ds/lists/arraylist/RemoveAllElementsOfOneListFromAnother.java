package com.codecafe.ds.lists.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveAllElementsOfOneListFromAnother {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(3, 5, 7));

        // approach 1
        list1.removeAll(list2);

        // approach 2 - better
        list1.removeAll(new HashSet<>(list2));

        System.out.println("list1 - list2 = " + list1);
    }

}