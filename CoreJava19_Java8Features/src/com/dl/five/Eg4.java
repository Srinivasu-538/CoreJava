package com.dl.five;

public class Eg4 {

	public static void main(String[] args) {


		Thread t  =new Thread(() -> {
			
			for (int i = 0; i < 5; i++) {
				System.out.println("Main Thread");
				
			}
			
		});
		t.start();

	}

} //what is the difference between binding and early binding
