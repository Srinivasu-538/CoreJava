package com.dl.one;

public class Eg2{
	
	 public static void main(String[] args) { 
		  
		 //instance
		 Eg2 eg = new Eg2();
		 eg.subtract();
		 
		 new Eg2().subtract();
		 
		 //static
		 main();
		 Eg2.main();
	 }
	 
	 //instance method
	 public void subtract() 
	 {
		 System.out.println("main method");
	 }
	 
	 //static method
	 public static void main()
	 {
		 System.out.println("not main method");
	 }
}
