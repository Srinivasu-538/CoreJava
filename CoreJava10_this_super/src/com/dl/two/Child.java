package com.dl.two;

class Parent {
	 int a =10;
	 int b = 20;
	 
}

public class Child extends Parent{
	 
	int a = 100;
	int b = 200;
	

	public static void main(String[] args) {
		Child child = new Child();
		child.display();
	}
	
	
	public void display() {
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(this.a);
		System.out.println(this.b);
	}
	

}
