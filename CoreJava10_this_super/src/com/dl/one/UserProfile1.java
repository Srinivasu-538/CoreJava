package com.dl.one;

public class UserProfile1 {
	
	//instance variables
	public String userName;
	public String email;
	public long contact;
	public String address;
	
	
	//this keyword will refer to the current class instant variables
	//it automatically generate while right and select source-generate constructors fields
	public UserProfile1(String userName, String email, long contact, String address) {
		//super(); we didn't use so remove
		this.userName = userName;
		this.email = email;
		this.contact = contact;
		this.address = address;
	}
	
//	public UserProfile1(String uName, String mail, long con, String add) {
//		//super(); we didn't use so remove
//		userName = uName;
//		email = mail;
//		contact = con;
//		address = add;
//	}
	
	public void display() {
		System.out.println(userName);
		System.out.println(email);
		System.out.println(contact);
		System.out.println(address);
	}
	
//	public UserProfile1(String userName, String email, long contact, String address) {
//		//super(); we didn't use so remove
//		userName = userName;
//		email = email;
//		contact = contact;
//		address = address;
//	}
//	



	public static void main(String[] args) {
		
		UserProfile1 profile = new UserProfile1("Srinivasu","srinu@gmail.com",1234567890l,"hyd");
        profile.display();
	}

}
