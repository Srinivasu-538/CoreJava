package com.dl.Literals;

public class Eg1 {

	public static void main(String[] args) {
		//Literals
		//Literals are constant values
		//types of Literals
		
		//Integer Literals
		int a = 100;
		Integer b = 200;
	    System.out.println(a);
	    System.out.println(b);
	    
	    //Floating point Literals
	    float f = 100.0f;
	    Float g = 200.0f;
	    System.out.println(f);
	    System.out.println(g);
	    
	    //Double Literals
	    double d = 500.0;
	    Double e = 600.0;
	    System.out.println(d);
	    System.out.println(e);
	    
	    //Character Literals
	    char ch = 'a';
	    Character chg = 'b';
	    System.out.println(ch);
	    System.out.println(chg);
	    
	    //Boolean Literals
	    boolean h = true;
	    Boolean i = false;
	    System.out.println(h);
	    System.out.println(i);
	    
	    //Binary, Octal, Hexadecimal
	    
	    //Binary 
	    //prefix = 0b, base = 2 , numbers = o,1
		int bi = 0b1010;
		System.out.println(bi);
		
		//Octal
		//prefix = o, base = 8, numbers = 0 to 7
		int oct = 01234;	
        System.out.println(oct);
        
        //Hexadecimal 
        //prefix = 0x, base = 16, numbers = 0 to 9 and a to f
        int hex = 0xabc;
        System.out.println(hex);

	}
}