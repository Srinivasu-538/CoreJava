package com.dl.one;

enum Days{
	
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY
}



public class Eg1 {

	public static void main(String[] args) {
		
		System.out.println(Days.MONDAY);
		System.out.println(Days.TUESDAY);
		System.out.println(Days.FRIDAY);
		
		System.out.println();
		
		Days[] values = Days.values();
		for(Days days: values) {
			System.out.println(days);
			System.out.println(days.ordinal());
		}
			System.out.println();
			
			Days valueOf = Days.valueOf("MONDAY");
			System.out.println(valueOf);
		
		
	}

}
