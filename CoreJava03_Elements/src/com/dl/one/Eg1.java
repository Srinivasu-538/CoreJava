package com.dl.one;

public class Eg1 {
	
	//variables
	//Types of variables
	//instance/non-static , static , local
	
	//instance/non-static
	 int x = 20;
	 int y = 30;
	 

	 //static
	 static int i = 100;
	 static int j = 200;
	 	
	public static void main(String[] args) {
		

		//local
		 int a = 1;
		 int b = 2;
		 System.out.println(a);
		 System.out.println(b);
 
		//Instance
		 Eg1 e = new Eg1();
		 System.out.println(e.x);
		 System.out.println(e.y);
		 
		 //another method to print
		 System.out.println(new Eg1().x);
		 System.out.println(new Eg1().y);

         //Non Static
		 System.out.println(i);
		 System.out.println(j);
		 
		 //another method to print
		 System.out.println(Eg1.i);
		 System.out.println(Eg1.j);


			
			
	}

}
