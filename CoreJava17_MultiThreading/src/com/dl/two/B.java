package com.dl.two;

class A implements Runnable {

	@Override
	public void run() {
		
		System.out.println(": 03 Run method of class A");
		synchronized (this) {
			
			System.out.println(": 05 synchronized block of class A");
			
			for(int i = 0; i < 5; i++) {
				System.out.println(i + ": 06 loop inside synchronized block of class A");
			}
			//notify();
		}
		
	}
}
public class B {

	public static void main(String[] args) throws InterruptedException {
		
		A a = new A();
		System.out.println(": 01 Object A reference " + a);
		
		Thread t = new Thread(a);
		t.start();
		
		synchronized (a) {
			System.out.println(": 02 synchronized block of class B");
			
			//a.wait();
			
			for(int i = 0; i < 5; i++) {
				System.out.println(i + ": 04 loop inside synchronized block of class B");
			}
		}

	}

}
