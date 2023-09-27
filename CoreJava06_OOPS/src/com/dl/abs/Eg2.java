package com.dl.abs;

abstract class AA {
	
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
	public abstract void m4();
}

abstract class BB extends AA {

	@Override
	public void m1() {
		System.out.println("m1 method");
		// TODO Auto-generated method stub	
	}

	@Override
	public void m2() {
		System.out.println("m2 method");
		// TODO Auto-generated method stub
		
	}
	
}

class CC extends BB {

	@Override
	public void m3() {
		System.out.println("m3 method");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		System.out.println("m4 method");
		// TODO Auto-generated method stub
		
	}
	
}
public class Eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CC cc = new CC();
		cc.m1();
		cc.m2();
		cc.m3();
		cc.m4();

	}

}
