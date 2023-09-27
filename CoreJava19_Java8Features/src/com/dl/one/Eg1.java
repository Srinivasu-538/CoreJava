package com.dl.one;

@FunctionalInterface
interface Properties {
	void add(int a, int b);
}

public class Eg1 implements Properties{

	public static void main(String[] args) {

        //inheritance
		Eg1 eg1 = new Eg1();
		eg1.add(10, 20);
		
		//polymorphism 
		Properties properties = new Eg1();
		properties.add(10, 40);
		

	}

	@Override
	public void add(int a, int b) {
		System.out.println(a+b);
		
	}

}
