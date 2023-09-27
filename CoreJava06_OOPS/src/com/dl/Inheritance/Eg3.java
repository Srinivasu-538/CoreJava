package com.dl.Inheritance;

class Big {
	
	void A() {
		System.out.println("A is the Class of Big");
	}
	
}

class Small extends Big {
	
	void B() {
		System.out.println("B is the Class of Small");
	}
	
}

public class Eg3 {

	public static void main(String[] args) {
		
		Big m = new Big();
		m.A();
		
		Small n = new Small();
		n.A();
		n.B();
		
		Big b1 = new Small();
		b1.A();
	

	}

}
