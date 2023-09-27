package com.dl.one;

public class Eg4 {

	public static void main(String[] args) {

		System.out.println("Before");
		
		try {
			
			String s1 = "Hello World";
			System.out.println(s1.charAt(4));
			System.out.println(s1.charAt(10));
			System.out.println(s1.charAt(12)); //java.lang.StringIndexOutOfBoundsException

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exception : " + e);
		}
		System.out.println("After");
	}

}
