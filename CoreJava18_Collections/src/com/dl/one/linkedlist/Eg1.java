package com.dl.one.linkedlist;

import java.util.LinkedList;

public class Eg1 {

	public static void main(String[] args) {


		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(30);
		System.out.println(list); //[10, 20, 30, 40, 10, 30]
		
		list.remove(0);
		list.remove(2);
		System.out.println(list); //[20, 30, 10, 30]
		
		list.set(3, 40);
		System.out.println(list); //[20, 30, 10, 40]
		
		list.add(4, 50);
		list.add(5, 60);
		System.out.println(list); //[20, 30, 10, 40, 50, 60]

	}

}
