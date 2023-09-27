package com.dl.one.hashmap;

import java.util.HashMap;

public class Eg1 {

	public static void main(String[] args) {


		HashMap<Integer,String> hashmap = new HashMap<>();
		hashmap.put(5, "NameFive");
		hashmap.put(2, "NameTwo");
		hashmap.put(1, "NameOne");
		hashmap.put(4, "NameFour");
		hashmap.put(2, "NameTwo");
		hashmap.put(2, "NameTwoDuplicate"); //value is duplicated and overrides
		hashmap.put(6, "NameFive");  //value is duplicated	
		
		hashmap.put(7,null); //null as a value allowed only multiple times
		hashmap.put(8,null);
		
		hashmap.put(null,null); //null as a key allowed only once
		hashmap.put(null,null);

		System.out.println(hashmap);
	}

}
