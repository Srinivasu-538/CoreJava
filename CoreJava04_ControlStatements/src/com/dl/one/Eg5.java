package com.dl.one;

import java.util.Scanner;

public class Eg5 {

	public static void main(String[] args) {
		
		// switch case
		//Cannot switch on a value of type double. Only convertible int values, strings or enum variables are permitted
		//Cannot switch on a value of type long. Only convertible int values, strings or enum variables are permitted
		//Cannot switch on a value of type float. Only convertible int values, strings or enum variables are permitted
		int userSalary = 70000;
		switch (userSalary) {
		case 10000:
			System.out.println("User Salary is : " + userSalary);
			break;
		
		case 20000:
			System.out.println("User Salary is : " + userSalary);
			break;
		
		case 30000:
			System.out.println("User Salary is : " + userSalary);
		    break;
		
		case 40000:
			System.out.println("User Salary is : " + userSalary);
		break;
		
		case 50000:
			System.out.println("User Salary is : " + userSalary);
			break;
			
		default :
			System.out.println("User Salary is out of range");
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter User Salary is : " );
		int s = scan.nextInt();
		switch (s) {
		case 10000:
			System.out.println("User Salary is : " + s);
			break;
		case 20000:
			System.out.println("User Salary is : " + s);
			break;
		case 30000:
			System.out.println("User Salary is : " + s);
			break;
		case 40000:
			System.out.println("User Salary is : " + s);
			break;
		case 50000:
			System.out.println("User Salary is : " + s);
			break;
			
			default:
				System.out.println("user salary is out of range70");
				
				scan.close();
		}
	}
}


