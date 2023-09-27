package com.dl.one;

public class Eg5 {

	public static void main(String[] args) {
		
		Eg5 userOne = new Eg5();
		userOne.createAccount("Raju", 9123456789l, "raju@gmail.com", "Rjy", "XYZ");
		bankDetails("SBI", "Rjy");
		
		Eg5 userTwo = new Eg5();
		userTwo.createAccount("Ram", 9123456780l, "ram@gmail.com", "Rjy", "XYZ");
		bankDetails("SBI", "Rjy");
		
		Eg5 userThree = new Eg5();
		userThree.createAccount("Ravi", 9123456798l, "ravi@gmail.com", "Rjy", "XYZ");
		bankDetails("SBI", "Rjy");

	}
	
	//Methods
	//Instance Method (Need bank Customers)
	
	public void createAccount(String userName, long userContact, String userEmail, String userAddress, String userPanCard) {
	System.out.println("UserName : "+ userName);
	System.out.println("UserContact : "+ userContact);
	System.out.println("UserEmail : "+ userEmail);
	System.out.println("UserAddress :"+ userAddress);
	System.out.println("UserPanCard :"+ userPanCard);
	}
	
	public static void bankDetails(String bankName, String bankAddress) {
		System.out.println(bankName);
		System.out.println(bankAddress);
		System.out.println("");
	}

}
