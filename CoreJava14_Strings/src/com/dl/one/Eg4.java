package com.dl.one;

public class Eg4 {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Python";
		String s3 = s1.concat(s2);
		System.out.println(s3); //JavaPython
		
		String s4 = s1.concat(s3).concat("JavaScript").concat("PHP");
		System.out.println(s4);
		
		
		String s5 = "JavaPython";
		//literals equals()
		System.out.println(s5.equals(s3));
		
		//literals ref
		System.out.println(s5 == s3);
		
		String s6 = "JavaPython";
		//literals ref
		System.out.println(s6 == s5);
		//literals content
		System.out.println(s6.equals(s5));
	}

}
