package com.dl.one.set;

import java.util.TreeSet;

public class Eg3 {

	public static void main(String[] args) {

		//natural sorting order // no duplicates //null not allowed
		TreeSet<String> treeset = new TreeSet<>();
		treeset.add("D");
		treeset.add("F");
		treeset.add("B");
		treeset.add("E");
		treeset.add("C");
		treeset.add("A");
		treeset.add("D");
		treeset.add("C");
		treeset.add("A");
		treeset.add("D");
		
		System.out.println(treeset);
		
		//treeset.add(null);
		//System.out.println(treeset); //java.lang.NullPointerException
		

		
	}

}
