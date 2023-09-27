package com.dl.one;

public class Eg5 {
	
	public static void main(String[] args) {
		
		//immutable
		String s1 =  "Java";
		System.out.println(s1);
		
		String s2 = new String("Python");
		System.out.println(s2);
		
		//mutable
		//Synchronized
		//@since  1.0
		StringBuffer sb1 = new StringBuffer("Javascript");
		System.out.println(sb1);
		System.out.println(sb1.append("ReactJs"));
		System.out.println(sb1);
		
		//since  1.5
		//not a synchronized
		StringBuilder sb2 = new StringBuilder("NodeJs");
		System.out.println(sb2);
		System.out.println(sb2.append("Reactnative"));
		System.out.println(sb2);
	}

}
