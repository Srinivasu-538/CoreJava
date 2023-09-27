package com.dl.one;

public class Eg2 {

	public static void main(String[] args) {
		
		//using literals  
		String s1 = "Hello";  //1 object i.e in SCP
		System.out.println(s1);
		
		//using new keyword 
		String s2 = new String("Hello"); //2 objects SCP and Heap
		System.out.println(s2);
		
		//using literals  
		String s3 = "Hello";  //1 object i.e in SCP
		System.out.println(s3);
		
		//using new keyword 
		String s4 = new String("Hello"); //2 objects SCP and Heap
		System.out.println(s4);
		
		//content comparison : checking it is equal or not
		//literals
		System.out.println(s1.equals(s3));
		
		//new keyword
		System.out.println(s2.equals(s4));
		
		//reference comparison
		//literals
		System.out.println(s1 == s3);
		
		//new keyword
		System.out.println(s2 == s4);
	}

}
