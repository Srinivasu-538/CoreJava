package com.dl.seven;

 class AA {
	
	public void m1(int i) {
		System.out.println("m1 method AA " + i);
	}
}
	
class BB extends AA{

	@Override
	public void m1(int i) {
		System.out.println("m1 method BB " + i);
	}
}

public class Eg3 {

	public static void main(String[] args) {


		AA a = new AA();
		a.m1(10);
		
		BB b = new BB();
		b.m1(20);
		
	}
}
