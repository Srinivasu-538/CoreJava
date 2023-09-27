package com.dl.example;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		boolean b = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				b=false;
				break;
			}
		}
		
		if(b != false) {
			System.out.println("prime");
		
		}else 
			System.out.println("not prime");
		}

	}


