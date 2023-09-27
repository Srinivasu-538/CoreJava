package com.dl.hasa;

class Company {
	
	String companyName;
	String companyAddress;
	
	public Company(String companyName, String companyAddress) {
		
		this.companyName = companyName;
		this.companyAddress = companyAddress;
	}
} 	 	

public class Employee {
	
	int empId;
	String empUserName;
	String empEmail;
	Company company; //this is called as data member or HAS-A Re  	lationship
	
	public Employee(int empId, String empUserName, String empEmail, Company company) {
		
		this.empId = empId;
		this.empUserName = empUserName;
		this.empEmail = empEmail;
		this.company = company;
	}
	
	public void dispaly() {
		System.out.println(empId);
		System.out.println(empUserName);
		System.out.println(empEmail);
		System.out.println(company.companyName);
		System.out.println(company.companyAddress);
		
	}

	public static void main(String[] args) {
		
		Company com = new Company("TCS","Madhapur");
		Employee emp = new Employee(1234
				,"Srinu","srinu@gmail.com",com);
		emp.dispaly();
	}
}
