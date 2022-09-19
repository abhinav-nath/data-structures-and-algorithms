package com.codecafe.datastructures.map.hashmap.model;

public class Address {

  private final String addressLine1;
  private final String addressLine2;
  private final int zipCode;

  public Address(String addressLine1, String addressLine2, int zipCode) {
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
    this.zipCode = zipCode;
  }

  @Override
  public String toString() {
    return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", zipCode=" + zipCode
      + "]";
  }

}
