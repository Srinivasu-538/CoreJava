package com.dl.one;

public class Eg1 {

	public static void main(String[] args) {
		
		//Main Thread
		
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		System.out.println(thread.getName());
		System.out.println(thread.getState());
		System.out.println(thread.getClass());
		System.out.println(thread.getId());
		System.out.println(thread.getPriority());
	}

}
