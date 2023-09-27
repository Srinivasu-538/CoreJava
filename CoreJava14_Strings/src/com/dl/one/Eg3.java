package com.dl.one;

public class Eg3 {

	public static void main(String[] args) {
		
		String s1 = "JAva";
		String s2 = "javA";
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1 == s2);
		
		System.out.println(s1.equalsIgnoreCase(s2));
	}

}
