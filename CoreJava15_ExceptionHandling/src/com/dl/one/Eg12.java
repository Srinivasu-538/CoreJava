package com.dl.one;

public class Eg12 {

	public static void main(String[] args) {


		try {
			System.out.println("Try block");
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Finally block");
		}
		
		try {
			System.out.println("Try block");
			System.exit(0);
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Finally block");
		}
	}

}
