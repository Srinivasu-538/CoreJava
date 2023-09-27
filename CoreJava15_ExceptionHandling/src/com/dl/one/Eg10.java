package com.dl.one;

public class Eg10 {

	public static void main(String[] args) throws Exception {
		
		userName("admin");
		

	}
	
	public static void userName(String name) throws Exception {
		if(name == "admin") {
			System.out.println("userName is :" + name);
		}else {
			throw new Exception("userName is not matched :");
		}
		
	}

}
