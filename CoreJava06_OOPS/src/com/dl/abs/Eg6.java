package com.dl.abs;

class AAA {
	public void m1() {
		System.out.println("m1 method");
	}
}

abstract class BBB extends AAA {
	public void m2() {
		System.out.println("m2 method");
	}
	abstract public void m3();
}

class CCC extends BBB {
	@Override
	public void m3() {
		System.out.println("m3 method");
	}
}
public class Eg6 {

	public static void main(String[] args) {
		
		CCC ccc = new CCC();
		ccc.m1();
		ccc.m2();
		ccc.m3();
		
	}

}

