package com.codecafe.datastructures.set;

import java.util.HashSet;
import java.util.Set;

public class ObjectsInHashSet {

  public static void main(String[] args) {
    Person p1 = new Person("john");
    Person p2 = new Person("john");

    Set<Person> persons = new HashSet<>();

    persons.add(p1);
    persons.add(p2);

    System.out.println(persons);
  }

}
