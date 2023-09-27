package com.dl.one;

public class Eg3 {

	public static void main(String[] args) {
		
		System.out.println("Before");
		
		try {
			
			String s = null;
			System.out.println(s.length()); //java.lang.NullPointerException
			
		} catch (NullPointerException e) {
			System.out.println("Exception : " + e);
		}
		System.out.println("After");
		
	}

}
