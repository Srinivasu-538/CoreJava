package com.dl.one;

public class Eg3 {
	 	

	public static void main(String[] args) {
		new Eg3();

	}
	static {
		int x = 10;
		System.out.println("Static block");
		System.out.println(x);		
	}
	{
		int a = 10;
		System.out.println("Instance block");
		System.out.println(a);
		

	}

}
