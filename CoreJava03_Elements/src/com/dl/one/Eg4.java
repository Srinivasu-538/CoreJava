package com.dl.one;

public class Eg4 {
	
	//object creation is required to call Default constructor
	public Eg4() {
		System.out.println("Default constructor"); 
	}
	
	public Eg4(int a) {
		System.out.println("Para constructor");
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		//constructor
		
		new Eg4();
		new Eg4(10);
	}

}
