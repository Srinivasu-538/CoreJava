package com.dl.one;
		
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner; 

public class Eg2 {

	public static void main(String[] args) throws IOException {
		
//		int a = 10;
//		if(a < 20) {
//			System.out.println("If Block Executed 1");
//		} else {
//			System.out.println("Else Block Executed 1");
//		}
//		
//		//XXX methods
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter any number : ");
//		int aa = scanner.nextInt();
//		if(aa < 20) {
//			System.out.println("If Block Executed 2");
//		} else {
//			System.out.println("Else Block Executed 2");
//		}
//		scanner.close();
		
		//BufferReader
		//Casting is required in Scanner class
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number");
		String readLine = read.readLine();
		int aaa = Integer.parseInt(readLine);
		System.out.println(aaa);
		if(aaa < 20) {
			System.out.println("If Block Executed 3");
		} else {
			System.out.println("Else Block Executed 3");
		}
		
         read.close();
	}

}
