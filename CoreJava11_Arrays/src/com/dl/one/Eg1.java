package com.dl.one;
public class Eg1 {

	public static void main(String[] args) {
		
		//Arrays are fixed in size
		//Arrays can hold same type of data(homogenious)
		
		//Create a array and provide size to it
		
		int a[] = new int[5]; //this is how we indicate an array
		//System.out.println(a); //here we didn't give values so output is [I@515f550a

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		//System.out.println(a[5]);  //java.lang.ArrayIndexOutOfBoundsException:    	 
		
		
		char c[] = new char[5];
		System.out.println(c);
		
		c[0] = '1';
		c[1] = '2';
		c[2] = '3';
		c[3] = '4';
		c[4] = '5';
		
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c[3]);
		System.out.println(c[4]);
		
		
		Integer i[] = new Integer[5];
		i[0] = 1000;
		System.out.println(i[0]);
		
	}

}
