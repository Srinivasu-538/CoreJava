package com.dl.Inheritance;


//Multilevel Inheritance

class AA {
	void m1() {
		System.out.println("M1 method");
	}
}

class BB extends AA {
	void m2() {
		System.out.println("M2 method");
	}
}

class C extends BB {
	void m3() {
		System.out.println("M3 method");
	}
}

public class Eg4 {
	
	public static void main(String[] args) {
		 
		C i = new C();
		i.m1();
		i.m2();
		i.m3();
		
	}

}
