//if a class implements more than one interface then interfaces are speared by commas .
// {class A implements B,C}

package com.dl.one;

interface AAA {
	void m1();
	
}

interface BBB {
	void m2();
	
}

public class Eg6 implements AAA, BBB  {

	public static void main(String[] args) {
		
		Eg6 eg6 = new Eg6();
		eg6.m1();
		eg6.m2();
		
		//polymorphism
		AAA a = new Eg6();
		a.m1();
		
		BBB b = new Eg6();
		b.m2();
		
			

	}

	@Override
	public void m2() {
		System.out.println("m1 method");
	}

	@Override
	public void m1() {
		System.out.println("m2 method");
	}

}
