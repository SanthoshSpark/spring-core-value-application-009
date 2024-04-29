package com.spring.core.demo;

//Employee.java
public class Employee {
	 private int id;
	 private String name;
	 private String designation;
	
	 public Employee(int id, String name, String designation) {
	     this.id = id;
	     this.name = name;
	     this.designation = designation;
	 }
	
	 public int getId() {
	     return id;
	 }
	
	 public String getName() {
	     return name;
	 }
	
	 public String getDesignation() {
	     return designation;
	 }
	
	 @Override
	 public String toString() {
	     return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	 }
}
