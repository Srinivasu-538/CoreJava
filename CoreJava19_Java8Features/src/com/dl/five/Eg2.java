package com.dl.five;

public class Eg2 {

	public static void main(String[] args) {


		//This is also anonymous implementation , we can find by seeing direct interface
		
		Runnable r = () -> {
			
			for(int i = 1; i < 5; i ++) {
			System.out.println("Run Method()");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
	}

}
