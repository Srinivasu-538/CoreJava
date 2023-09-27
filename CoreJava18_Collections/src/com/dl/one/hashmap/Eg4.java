package com.dl.one.hashmap;

import java.util.LinkedHashMap;

public class Eg4 {

	public static void main(String[] args) {
		
		//Ordered Elements, Duplicate values allowed, Duplicate values allowed and overrides the data with key
		LinkedHashMap<Integer,String> linkedhashmap = new LinkedHashMap<> ();
		linkedhashmap.put(2, "NameTwo");
		linkedhashmap.put(2, "NameTwoDuplicate");
		linkedhashmap.put(3, "NameThree");
		linkedhashmap.put(1, "NameOne"); 
		linkedhashmap.put(5, "NameFive");
		linkedhashmap.put(6, "NameSix");
		linkedhashmap.put(7, "NameFour");
		linkedhashmap.put(6, "NameSix");
		linkedhashmap.put(7, "NameFour");
		System.out.println(linkedhashmap); //{2=NameTwoDuplicate, 3=NameThree, 1=NameOne, 5=NameFive, 6=NameSix, 7=NameFour}


	}

}
