package com.dl.one.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Eg3 {

	public static void main(String[] args) {
		
		//Insertion order preserved //Duplicate values allowed //value is duplicate and overrides
		HashMap<Integer,String> hashmap = new HashMap<>();
		hashmap.put(1, "NameOne");
		hashmap.put(2, "NameTwo");
		hashmap.put(3, "NameThree");
		hashmap.put(4, "NameFour");
		hashmap.put(5, "NameFive");
		hashmap.put(6, "NameSix");
		
		
	    System.out.println(hashmap);
		
		Collection<String> values = hashmap.values();
		System.out.println(values); //the return type for values is collections
		
		Set<Integer> keys = hashmap.keySet();
		System.out.println(keys);//the return type for keys is set
		
	}

}
