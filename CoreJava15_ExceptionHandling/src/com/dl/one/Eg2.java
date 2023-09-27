package com.dl.one;

public class Eg2 {

	public static void main(String[] args) {
		
		System.out.println("Before");
		
		try {
			
			int a[] = {10,20,30,40,50};
			System.out.println(a[0]);
			System.out.println(a[5]); //java.lang.ArrayIndexOutOfBoundsException
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception : " + e);
		}
		
		System.out.println("After");
	}

}
