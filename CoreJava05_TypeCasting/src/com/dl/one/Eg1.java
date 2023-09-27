package com.dl.one;

public class Eg1 {

	public static void main(String[] args) {
		
		//TypeCasting
		//Two types
		//Implicit and Explicit TypeCasting
		
		
		//Implicit TypeCasting
		//It Defines Converts data types from lower to higher directly
		//byte-short-int-long-float-double
		//we can covert char only from int-long-float-double but not from bye and short
		
		byte b = 25;
		
		short s = b;
		System.out.println(s);
		
		int i = s;
		System.out.println(i);
		
		long l = i;
		System.out.println(l);
		
		float f = l;
		System.out.println(f);
		
		double d = f;
		System.out.println(f);
		
		char ch = 'a';
		int i1 = ch;
		System.out.println(i1);
		
		long l1 = i1;
		System.out.println(l1);
		

		float f1 = l1;
		System.out.println(f1);
		
		double d1 = f1;
		System.out.println(f1);
		
		
	}

}
