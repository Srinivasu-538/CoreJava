package com.dl.one;

class Big {
	public void m1() {
	System.out.println("m1 method big");
	}
}

class Small extends Big {
	public void m2() {
		System.out.println("m2 method small");
	}
}
public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inheritance
		Small small = new Small();
		small.m1();
		small.m2();
		
		
		//Polymorphism
		Big big = new Small();
		big.m1();
		
		//object casting
		Small small2 = (Small)big;
		small2.m1();
		small2.m2();
		
		//child c = (child)   new parent;
//		Small small3 = (Small)new Big();
//		small3.m1();
//		small3.m2();
		// java.lang.ClassCastException
		

	}

}
