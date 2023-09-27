package com.dl.one.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Eg3 {

	public static void main(String[] args) {


		ArrayList<String> arraylist = new ArrayList<>();
		arraylist.add("D");
		arraylist.add("B");
		arraylist.add("A");
		arraylist.add("E");
		arraylist.add("F");
		arraylist.add("C");
		System.out.println("Insertion Order / Ordered Elements  :" +arraylist);
		
		arraylist.sort(null);
		System.out.println("Sorting Order " + arraylist);
		

		LinkedList<String> list = new LinkedList<>(); //polymorphism
	    list.add("D");
	    list.add("E");
	    list.add("A");
	    list.add("B");
	    list.add("C");
	    System.out.println("Insertion Order / Ordered Elements  :" +list);
	    
	    list.sort(null);
	    System.out.println( "Sorting Order " +list);
	    
	    ArrayList<Integer> list1 = new ArrayList<>();
	    list1.add(40);
	    list1.add(50);
	    list1.add(10);
	    list1.add(30);
	    list1.add(20);
	    System.out.println("Insertion Order / Ordered Elements  :" +list1);
	    
	    list1.sort(null);
	    System.out.println( "Sorting Order " +list1);

	}

}
