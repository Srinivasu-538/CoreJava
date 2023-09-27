package com.dl.five;

class A implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Run Method() A");
			
			}
		
	}
	
}
public class Eg1 {

	public static void main(String[] args) {
		
		A a = new A();
		Thread thread = new Thread(a);
		for (int i = 0; i < 5; i++) {
			System.out.println("Run Method() Eg1");
		}

		System.out.println();
		thread.start();
		
		
	}

}
