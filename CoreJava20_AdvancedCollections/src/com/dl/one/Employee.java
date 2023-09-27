package com.dl.one;

public class Employee implements Comparable<Employee> {
	
	int id;
	private Object name;


	@Override
	public int compareTo(Employee emp) {
		return emp.name.compareTo(name);
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		
	}

}
