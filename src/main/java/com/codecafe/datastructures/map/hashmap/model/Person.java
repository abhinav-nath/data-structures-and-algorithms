package com.codecafe.datastructures.map.hashmap.model;

public class Person {

  private final long ssn;
  private String firstName;
  private String lastName;
  private int age;
  private Address address;

  public Person(long ssn, String firstName, String lastName, int age, Address address) {
    this.ssn = ssn;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.address = address;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Person [ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
      + ", address=" + address + "]";
  }

}
