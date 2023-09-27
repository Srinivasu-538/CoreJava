package com.dl.one;

class Parent  {
	public  void m1() {
		System.out.println("m1 method parent");
	}
}

class Child extends Parent{           //Cannot override the final method from Parent
//	public final void m1() {
//		System.out.println("m2 method child");
//	}
}
public class Eg2 {

	public static void main(String[] args) {
		
		Parent p = new Child();
		p.m1();
		
		Parent p1 = new Parent();
		p1.m1();
	}

}
