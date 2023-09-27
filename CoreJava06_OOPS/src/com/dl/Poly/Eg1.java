package com.dl.Poly;

public class Eg1 {

	public static void main(String[] args) {
		
		//method overloading
		//one class is enough with diff args 
		//method overloading have same method name with different arguments
		
		Eg1 eg1 = new Eg1();
		eg1.m1(10);
		eg1.m1(10l);
		eg1.m1(10d);
	}
	public void m1(int a) {
		System.out.println("Int :" + a);
	}
	
	public void m1(long l) {
		System.out.println("long :" + l);
	}
	
	public void m1(double d) {
		System.out.println("double :" + d);
	}
		

}
