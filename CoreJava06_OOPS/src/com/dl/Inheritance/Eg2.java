package com.dl.Inheritance;

class A {	
	void m1() {
		System.out.println("m1 method of class A");
	}
}

class B extends A {
    void m2() 
    {
	System.out.println("m2 method of class B");
}
}
public class Eg2 {

	public static void main(String[] args) {
		
		B b = new B();
		b.m1();
		b.m2();

	}

}
