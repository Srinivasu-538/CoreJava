package com.dl.two;

class ParentTwo {
	
	public void m1() {
		System.out.println("M1 method parenttwo");
	}
}

public class ChildTwo extends ParentTwo {
	
	public void m1() {
		System.out.println("M2 method childtwo");
	}
	
	public void m2() {
		this.m1();
		super.m1();
			
	}

	public static void main(String[] args) {
		
		ChildTwo childtwo = new ChildTwo();
		childtwo.m1();
		//childtwo.m2(); child prints its value
		
		ParentTwo parenttwo = new ParentTwo();
		parenttwo.m1();
		
		childtwo.m2();
	

	}

}
