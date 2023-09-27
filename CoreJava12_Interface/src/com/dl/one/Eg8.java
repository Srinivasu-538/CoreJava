//In java for normal class we cannot extend multiple classes at a time , 
//so there is no multiple inheritance it is possible in interface

package com.dl.one;

interface UserOne {
	void m1();
	
}

interface UserTwo {
	void m2();
}

interface UserThree {
	void m3();
}

public interface Eg8 extends UserOne, UserTwo, UserThree {
	
	public class Impl implements Eg8 {

		@Override
		public void m1() {
			System.out.println("m1");
			
		}

		@Override
		public void m2() {
			System.out.println("m2");
			
		}

		@Override
		public void m3() {
			System.out.println("m3");
			
		}
		
	}
	
	public static void main(String[] args) {
		Impl impl = new Impl();
		impl.m1(); 
		impl.m2();
		impl.m3();
	}
	

}
