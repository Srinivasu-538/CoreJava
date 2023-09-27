package com.dl.one;

public class Eg2 extends Thread {

	//ways to create thread class
	//extending the thread class
	
	public static void main(String[] args) {
		
		new Eg2().run();
		

		Eg2 eg2 = new Eg2();
		eg2.start();
	}
	
	public void run() {
		System.out.println("Run method");
	}


}
