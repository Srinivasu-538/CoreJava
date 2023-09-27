package com.dl.one;

public class Eg3 {

	public static void main(String[] args) {
		
		//iterations for,while,do-while,for-each
		
		int a[] = {10,20,30,40,50};
		System.out.println("For loop");
		for(int i=0; i<5;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println();
		
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println();
		
		for(int i=4; i>=0;i--) {
			System.out.println(a[i]);
		}
			
			System.out.println();
			
			for(int i=a.length-1; i>=0;i--) {
				System.out.println(a[i]);
			}
			
			System.out.println();
			
			for(int i=0;i<3;i++) {
				System.out.println(a[i]);
			}
			
			System.out.println();
			
			System.out.println("while loop");
			int j = 0;
			while (j<5) {
				System.out.println(a[j]);
				j++;
			}
			
			System.out.println();
			
			System.out.println("Do while");
			int k = 0;
			do {
				System.out.println(a[k]);
				k++;
			}while(k<5);
			
			System.out.println();
			
			System.out.println("for-each");
			for(int i:a) {
				System.out.println(i);
			}
	}

}
