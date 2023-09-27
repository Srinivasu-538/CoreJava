package com.dl.Inheritance;

class GrandParent {
	void m1() {
		System.out.println("m1 method");
	}
}


class Parent extends GrandParent{
	void m2() {
		System.out.println("m2 method");
	}
}


class Child extends GrandParent{
	void m3() {
		System.out.println("m3 method");
	}
}

class GrandChild extends GrandParent{
	void m4() {
		System.out.println("m4 method");
	}
}

public class Eg6 {

	//hierarchical Inheritance
	
	public static void main(String[] args) {
		
		GrandParent grandparent = new GrandParent();
		grandparent.m1();
		//grandparent.m2();The method m2() is undefined for the type GrandParent
		//grandparent.m3();The method m3() is undefined for the type GrandParent      
	
		Parent parent = new Parent();
		parent.m1();
		parent.m2();
		//parent.m3(); method m3() is undefined for the type Parent
		
		Child child = new Child();
		child.m1();
		//child.m2(); The method m2() is undefined for the type Child
		child.m3();
		
		GrandChild grandchild = new GrandChild();
		grandchild.m1();
		//grandchild.m2();The method m2() is undefined for the type GrandChild
		//grandchild.m3(); The method m3() is undefined for the type GrandChild
		grandchild.m4();
		

	}

}
