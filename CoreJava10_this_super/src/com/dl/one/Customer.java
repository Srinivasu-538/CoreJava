package com.dl.one;

public class Customer {
	//instance methods
	public void addCustomer() {
		
		this.deleteCustomer();
		this.updateCustomer();
		System.out.println("Add customer");
	}
	
	public void deleteCustomer() {
		System.out.println("delete customer");
	}
	
	public void updateCustomer() {
		System.out.println("update customer");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer() ;
		customer.addCustomer();
	    customer.deleteCustomer();
	    customer.updateCustomer();
	
	}

}
