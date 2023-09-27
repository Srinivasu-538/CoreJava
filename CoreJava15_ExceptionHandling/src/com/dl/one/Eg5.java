package com.dl.one;

public class Eg5 {

	public static void main(String[] args) {
		
		System.out.println("Before");
		
		try {
			
			String s1 = "Ten";
			int parseInt = Integer.parseInt(s1);
			System.out.println(parseInt);  //java.lang.NumberFormatException
			
		} catch (NumberFormatException e) {
			System.out.println("Exception : " + e);
		}
		
		System.out.println("After");
	}

}
