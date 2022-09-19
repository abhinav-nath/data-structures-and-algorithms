package com.codecafe.datastructures.map.hashmap.model;

public class Department {

  private final String departmentName;
  private final String departmentCategory;

  public Department(String departmentName, String departmentCategory) {
    this.departmentName = departmentName;
    this.departmentCategory = departmentCategory;
  }

  @Override
  public String toString() {
    return "Department [departmentName=" + departmentName + ", departmentCategory=" + departmentCategory + "]";
  }

}
