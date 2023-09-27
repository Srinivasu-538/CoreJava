package com.dl.one;

public class Employee {
	
	public Employee() {
		this("Srinivasu",9876543210l);
		System.out.println("Default constructor");
	}
	
	public Employee(String empName, long contact) {
		System.out.println(empName);
		System.out.println(contact);
	}
 
	public static void main(String[] args) {
		
		new Employee();
		new Employee("Srinivasu",9876543210l);

	}

}
