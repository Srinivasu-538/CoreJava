package com.dl.example;

import java.util.Scanner;

public class SwappingIntegers {

	public static void main(String[] args) {

	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number a: ");
			int b = sc.nextInt();
			
			System.out.println("Enter Number b: ");
			int a = sc.nextInt();
			
		
		
		//logic
		int c = a;
		a = b;
		b = c;
		
		System.out.println("Before Swapping : " + a + " " + b);
		
		
		System.out.println("After Swapping : " + b + " " + a);
		

	}

}
