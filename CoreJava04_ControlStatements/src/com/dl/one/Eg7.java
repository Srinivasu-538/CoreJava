package com.dl.one;

import java.util.Scanner;

public class Eg7 {

	public static void main(String[] args) {
		// while
		//if u don't know the iterations go for the while loop
		
		int i = 0;
		while(i<=5)
		{
			System.out.println(i);
		    i++;
		}
		System.out.println(" ");
		i = 5;
		while(i>=0)
		{
			System.out.println(i);
			i--;
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr a number : ");
		int y= scan.nextInt();
		while(y>=0)
		{
			System.out.println(i);
			y--;
			scan.close();
		}
		
	}

}
