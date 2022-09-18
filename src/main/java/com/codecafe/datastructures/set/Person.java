package com.codecafe.datastructures.set;

import java.util.Objects;

public class Person {

  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public int hashCode() {

    /*
     * this is not a good implementation of the hashCode
     * it just returns the same hashCode for the objects
     * having same name
     */

    return Objects.hash(name);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Person other = (Person) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + "]";
  }

}
