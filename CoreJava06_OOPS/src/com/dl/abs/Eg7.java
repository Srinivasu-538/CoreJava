package com.dl.abs;

abstract class Product{
	static int productPrice;
	static int discount;
	
	public void getDiscount(int offer) {
		discount = productPrice - offer;
		System.out.println("After discount product price is "+ discount);
	}
	public void getUserDetails(String fname, String lname, String productname) {
		System.out.println("User Firstname :" + fname);
		System.out.println("User Lastname :" + lname);
		System.out.println("User Productname :" + productname);
	}
}

class productImpl extends Product  {
	
}

public class Eg7 {

	public static void main(String[] args) {
		
		productImpl impl = new productImpl();
		impl.getUserDetails("Srini", "vasu", "Redmi");
		productImpl.productPrice = 12000;
		impl.getDiscount(2000);



	}

}
