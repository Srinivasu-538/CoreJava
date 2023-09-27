
package com.dl.one;

public class Eg2 {

	public static void main(String[] args) {
		
		//create array and initialize it
		 int a[] = {10, 20, 30, 40, 50};
		 System.out.println(a[0]);
		 System.out.println(a[1]);
		 System.out.println(a[2]);
		 System.out.println(a[3]);
		 System.out.println(a[4]);
		 
		 //providing negative and zero as the size of the array
		 
//		 int b[] = new int[-5];
//		 b[-4] = 100;
//		 System.out.println(b[-4]);   java.lang.NegativeArraySizeException
		 
		 //providing zero as the size of the array
		 
//		 int i[] = new int[0];
//		 i[0] = 100;
//		 System.out.println(i[0]);  java.lang.ArrayIndexOutOfBoundsException

		 //finding the length of the array
		 
		 System.out.println(a.length);
		 System.out.println(a.length-1);
		 System.out.println(a.length-3);
		 System.out.println(a.length*7);
		 System.out.println(a.length);
	}

}
