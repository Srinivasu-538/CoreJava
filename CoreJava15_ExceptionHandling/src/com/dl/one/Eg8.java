package com.dl.one;

public class Eg8 {

	public static void main(String[] args) {
		
		System.out.println("Before");
		try {
			
			int a[] = new int[-5]; 
			a[-5] = -50;
			System.out.println(a[-5]);//java.lang.NegativeArraySizeException
			
		} catch (NegativeArraySizeException e) {
			System.out.println("Exception : " + e);
		}
		System.out.println("After");
	}

}
