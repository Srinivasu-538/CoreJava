package com.dl.two;

@FunctionalInterface
interface Properties {
	void add(int a, int b);
}

public class Eg1 {

	public static void main(String[] args) {
		 
		Properties properties = (a, b) -> System.out.println("Sum is : " + (a+b));
		properties.add(10, 20);


	}

}
