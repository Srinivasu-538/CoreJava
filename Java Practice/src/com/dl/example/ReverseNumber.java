package com.dl.example;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int  num = sc.nextInt();
		
//		int a = 0;
//		
//		while(num!=0) {
//			
//			a = a*10 + num%10;
//			num=num/10;
//			
//		}
//		System.out.println("Reverse String : " + a);
//		
		//Using StringBuffer
		
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		StringBuffer rev = sb.reverse();
//		System.out.println("Reverse String : " + rev);
		
		
		//Using StringBuilder
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append(num);
		StringBuilder rev = sb1.reverse();
		System.out.println("Reverse String : " + rev);
		
	}

}
