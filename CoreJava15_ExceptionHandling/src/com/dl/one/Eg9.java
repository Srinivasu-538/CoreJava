package com.dl.one;

public class Eg9 {

	public static void main(String[] args) {
		
     try {
			
			int a = 10;
			int b = 20;
			int c = 0;
			
			System.out.println(a/b);
			//System.out.println(a/c); // java.lang.ArithmeticException
			
			int aa[] = {10,20,30,40,50};
			System.out.println(aa[0]);
			//System.out.println(aa[5]); //java.lang.ArrayIndexOutOfBoundsException
			
			String s = null;
			//System.out.println(s.length()); //java.lang.NullPointerException
			
			String s1 = "Hello World";
			System.out.println(s1.charAt(4));
			System.out.println(s1.charAt(10));
			System.out.println(s1.charAt(12)); //java.lang.StringIndexOutOfBoundsException

     }catch(ArithmeticException e) {
    	 System.out.println("Error is ArthimeticException : " + e);
     }catch(ArrayIndexOutOfBoundsException e) {
    	 System.out.println("Error is ArrayIndexOutOfBoundsException` : " + e);
     }catch(NullPointerException e) {
    	 System.out.println("Error is NullPointerException : " + e);
     }catch(StringIndexOutOfBoundsException e) {
    	 System.out.println("Error is StringIndexOutOfBoundsException : " + e);
		}
    
	}

}
