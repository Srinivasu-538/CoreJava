package com.dl.one;

interface ParentOne {
	void m1(); //Here we didn't write public abstract it automatically reads like public abstract
	public void m2(); //Here we didn't write public abstract it automatically reads like public abstract
	public abstract void m3();
	public abstract void m4();
}

public class Eg4 implements ParentOne { //Here we extract from interface so we use implements keyword
	public static void main(String[] args) {
		
		Eg4 eg4 = new Eg4();
		eg4.m1();
		eg4.m2();
		eg4.m3();
		eg4.m4();
		
		//polymorphism
		ParentOne p = new Eg4();
		p.m1();
		p.m2();
		p.m3();
		p.m4();
		
		
		
	}

	@Override
	public void m1() {
		System.out.println("M1 method");
		
	}

	@Override
	public void m2() {
		System.out.println("M2 method");
		
	}

	@Override
	public void m3() {
		System.out.println("M3 method");
		
	}

	@Override
	public void m4() {
		System.out.println("M4 method");
		
	}


}

