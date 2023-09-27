package com.dl.one.set;

import java.util.HashSet;

public class Eg1 {

	public static void main(String[] args) {

		//no insertion order //no duplicates //null allowed once
		HashSet<String> hashset = new HashSet<>();
		hashset.add("NameOne");
		hashset.add("NameTwo");
		hashset.add("NameThree");
		hashset.add("NameFour");
		hashset.add("NameFive");
		hashset.add("NameOne");
		hashset.add("NameTwo");
		hashset.add("NameThree");
		
		System.out.println(hashset);
		
		hashset.add(null);
		hashset.add(null);
		System.out.println(hashset);
	}

}
