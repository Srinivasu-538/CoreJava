package com.dl.one.hashmap;

import java.util.HashMap;

public class Eg2 {

	public static void main(String[] args) {



		HashMap<Integer,String> hashmap = new HashMap<>();
		hashmap.put(1, "NameOne");
		hashmap.put(2, "NameTwo");
		hashmap.put(3, "NameThree");
		hashmap.put(4, "NameFour");
		hashmap.put(5, "NameFive");
		hashmap.put(6, "NameSix");
		
		System.out.println(hashmap.size());
		System.out.println(hashmap);
		
		System.out.println(hashmap.remove(3));
		System.out.println(hashmap);
		
		System.out.println(hashmap.remove(2, "NameTwoDuplicate"));
		System.out.println(hashmap);
		
		System.out.println(hashmap.remove(2, "NameTwo"));
		System.out.println(hashmap);
		
	    hashmap.clear();
	    System.out.println(hashmap);

	}

}
