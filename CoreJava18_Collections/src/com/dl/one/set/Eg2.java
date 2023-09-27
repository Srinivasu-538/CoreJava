package com.dl.one.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Eg2 {
	public static void main(String[] args) {

		// LinkedHashSet : Insertion order //no duplicates //null allowed once
		HashSet<String> hashset = new LinkedHashSet<>();
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
