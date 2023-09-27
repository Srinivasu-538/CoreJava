//in some Case we don't want to implement all the abstract methods in interface, then we can implement 
//the expected method in next abstract class and remaining methods in normal class


package com.dl.one;

interface One{
	
	void m1();
	void m2();
	void m3();
	void m4();
}

abstract class OneImpl implements One {
	

	@Override
	public void m1() {
		System.out.println("m1 method");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 method");
		
	}



}
public class Eg7 extends OneImpl {

	public static void main(String[] args) {


		OneImpl impl = new Eg7();
		impl.m1();
		impl.m2();
		impl.m3();
		impl.m4();
		

	}

	@Override
	public void m3() {
		System.out.println("m3 method");
		
	}

	@Override
	public void m4() {
		System.out.println("m4 method");
		
	}

}


