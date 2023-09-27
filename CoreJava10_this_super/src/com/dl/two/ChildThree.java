package com.dl.two;

class ParentThree {
	
	public ParentThree() {
	System.out.println("Default constructor ParentThree");
	}
	
	public ParentThree(int a) {
		System.out.println("parametric constructor : " + a);
	}
}

public class ChildThree extends ParentThree {
	public ChildThree() {
		this(10, 20);
		
		System.out.println("Default constructor ChildThree");
	}
	public ChildThree(int a, int b) {
		super(10);
		System.out.println("parametric constructor : " + a + " " + b);

   }
	public static void main(String[] args) {
		new ParentThree();
		new ChildThree();
		
	}
	
	

}
