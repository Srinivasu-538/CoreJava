package com.dl.two;

import java.util.ArrayList;
import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	
	int id;
	String name;
	
	public Employee() {
		
	}
	
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public int compare(Employee emp1, String emp2) {
		return emp1.name.compareTo(emp2);
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "B");
		Employee e2 = new Employee(1, "D");
		Employee e3 = new Employee(1, "A");
		Employee e4 = new Employee(1, "C");
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		System.out.println(list);

	}


	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public int compare(Employee o1, Employee o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
