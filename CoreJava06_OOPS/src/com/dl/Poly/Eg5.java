package com.dl.Poly;

class AA {
	public AA() {
		System.out.println("Default Constructor of AA");
	}
}

class BB extends AA {
	
	// There is no constructor overriding we have only method overriding
//	public AA() {
//		System.out.println("Default Constructor of AA");
//	}
	
	public BB() {
		System.out.println("Default Constructor oF BB");
	}
}

public class Eg5 {

	public static void main(String[] args) {
		
		new BB(); 
		 
		}

}
