package com.dl.seven;

public class Eg1 {

	public void m1() {
		System.out.println("M1 method");
	}
	
	@Deprecated
	public void m2() {
		System.out.println("M2 method");
	}
	
	@Deprecated
	public void m3() {
		System.out.println("M3 method");
	}
	
	public static void main(String[] args) {

		Eg1 eg1 = new Eg1();
		eg1.m1();
		eg1.m2();
		eg1.m3();

		Integer integer = new Integer(10);
		Integer i;
		
		
		
		
	}

}
