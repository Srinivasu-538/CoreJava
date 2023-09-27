package com.dl.one;

public class Eg9 {

	public static void main(String[] args) {
		// continue, break
		
		for (int i=0; i<10; i++) {
			if (i == 5) {
				
			continue;
		}
			System.out.println(i);
	    }
		
		
		for (int i=0;i<10;i++ ) {
			if(i == 9) {
				break;
			}
			System.out.println(i);
		}
	}
}
