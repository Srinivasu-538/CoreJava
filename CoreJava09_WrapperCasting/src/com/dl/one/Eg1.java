package com.dl.one;

public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Primitive to primitive
		double d = 100.25;
		float f = (float)d;
		System.out.println(f);
		
		//primitive to wrapper
		double d1 = 102.29;
		Float f1 = (float)d1;
		System.out.println(f1);
		
		Long l1 = (long)d1;
		System.out.println(l1);
		
		Float i = (float)d1;
		System.out.println(i);
		
		Integer i3 = (int)d1;
		System.out.println(i3);
		
		//Wrapper to Wrapper
		Double d2 = 103.32;
		Integer i1 = (Integer)d2.intValue();
		System.out.println(i1);
		
		Float f2 = (Float)d2.floatValue();
		System.out.println(f2);
		
		Long l2 = (Long)d2.longValue();
		System.out.println(l2);

	}

}
