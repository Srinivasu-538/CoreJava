package com.dl.Poly;

public class Eg3 {

	public static void main(String[] args) {


		// constructor overloading
		new Eg3();
		new Eg3(10);
		new Eg3(10l);
		
	}
	
	public Eg3() {
		System.out.println("Default constructor");
	}

	public Eg3(int a) {
		System.out.println("parametric constructor int :" + a);
	}
	
	public Eg3(long l) {
		System.out.println("Default constructor long :" + l);
	}
}
