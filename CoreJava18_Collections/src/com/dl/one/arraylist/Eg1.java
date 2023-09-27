package com.dl.one.arraylist;

import java.util.ArrayList;

public class Eg1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arraylist = new ArrayList<>();
		//add(element);
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(30);
		arraylist.add(40);
		arraylist.add(50);
		System.out.println(arraylist); //[10, 20, 30, 40, 50]
		
		//add(index,element);
		arraylist.add(2, 60);
		arraylist.add(4, 70);
		arraylist.add(6, 80);
		arraylist.add(8, 90);
		System.out.println(arraylist); //[10, 20, 60, 30, 70, 40, 80, 50, 90]
		
		arraylist.add(0, 100);
		System.out.println(arraylist); //[100, 10, 20, 60, 30, 70, 40, 80, 50, 90]
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10000);
		list.add(20000);
		list.add(30000);
		list.add(40000);
		list.addAll(0, arraylist);
		System.out.println(list); //[100, 10, 20, 60, 30, 70, 40, 80, 50, 90, 10000, 20000, 30000, 40000]
		System.out.println(list.size());
	}

}
