package com.dl.three;

@FunctionalInterface
interface Methods {
	 
	void add();
} 

public class Eg1 {
	
	int a;
	int b;
	
	public Eg1(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public void dispaly() {
		
		Methods methods1 = () -> System.out.println(a+b);
		methods1.add();
	 
		
		Methods methods = () -> {
			System.out.println(a+b);
		};
		methods.add();
		
	}

	public static void main(String[] args) {
		
		Eg1 eg1 = new Eg1(10, 20);
		eg1.dispaly();
	}

}
