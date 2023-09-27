package com.dl.four;

@FunctionalInterface
interface Login {
	
	public abstract void s();
	
}

public class Eg1 {

	public static void main(String[] args) {
		
		// Annonymous Inner Type
		
		Login l = new Login() {

			@Override
			public void s() {
				System.out.println("Login() Method");
				
			}
		};
		l.s();
	}

}
