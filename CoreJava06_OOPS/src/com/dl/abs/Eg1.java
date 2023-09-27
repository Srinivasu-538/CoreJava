package com.dl.abs;

abstract class A {
	public void m1() {
		System.out.println("M1 method of non abs");	
	}
	public abstract void m2();
}

class B extends A {
	public void m2() {
		System.out.println("m2 method");
	}
}

public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		b.m1();
		b.m2();
		
		A a = new B();
		a.m1();
		a.m2();

	}

}
