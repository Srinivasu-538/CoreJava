package com.dl.one.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Eg2 {

	public static void main(String[] args) {


		List<String> arraylist = new ArrayList<>(); //polymorphism
		arraylist.add(null);
		arraylist.add(null);
		arraylist.add(null);
		arraylist.add(null);
		System.out.println(arraylist);
		
		arraylist.add(0, null);
		System.out.println(arraylist);
		
		LinkedList<String> linkedlist = new LinkedList<>(); //polymorphism
	    linkedlist.add(null);
	    linkedlist.add(null);
	    linkedlist.add(null);
	    System.out.println(linkedlist);
	}

}
