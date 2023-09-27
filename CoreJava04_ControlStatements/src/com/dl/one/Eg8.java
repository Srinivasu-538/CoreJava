package com.dl.one;

import java.util.Scanner;

public class Eg8 {
	
	static Scanner scan;


	public static void main(String[] args) {
		
		// do-while
		
		// do {
		//System.out.println("Do Block");
	    //   }while("true")
		
		
		int i = 0;
		do {
			System.out.println(i);
			i++;
		}while(i<=5);
		
		
		i = 5;
		do {
			System.out.println(i);
			i--;
		} while(i>=0);
		
	     scan = new Scanner(System.in);
	     System.out.println("Enter any number");
	     int ii = scan.nextInt();
	     do {
				System.out.println(ii);
				ii--;
			} while(ii>=0);
	     scan.close();
	}

}
