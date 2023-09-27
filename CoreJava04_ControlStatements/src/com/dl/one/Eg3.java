package com.dl.one;

import java.util.Scanner;

public class Eg3 {

	public static void main(String[] args) {
		
		//else if
//		 double userSalary = 70000;
//		  if(userSalary == 10000) {
//			  System.out.println("User Salary is : " + userSalary);
//		  } else if (userSalary == 20000) {
//			  System.out.println("User Salary is : " + userSalary);
//		  } else if (userSalary == 30000) {
//			  System.out.println("User Salary is : " + userSalary);
//		  } else if (userSalary == 40000) {
//			  System.out.println("User Salary is : " + userSalary);
//		  } else if (userSalary == 50000) {
//			  System.out.println("User Salary is : " + userSalary);
//		  } else {
//			  System.out.println("User Salary is not validate ");
//		  }
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter Your Number : ");
		  double usalary = scan.nextDouble();
		  if(usalary == 10000) {
			  System.out.println("User Salary is : " + usalary);
		  } else if (usalary == 20000) {
			  System.out.println("User Salary is : " + usalary);
		  } else if (usalary == 30000) {
			  System.out.println("User Salary is : " + usalary);
		  } else if (usalary == 40000) {
			  System.out.println("User Salary is : " + usalary);
		  } else if (usalary == 50000) {
			  System.out.println("User Salary is : " + usalary);
		  } else {
			  System.out.println("User Salary is not validate ");
		  }
		  scan.close();
		  
		  
		  
	}
}