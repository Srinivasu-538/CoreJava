package com.dl.one.hashmap;

import java.util.LinkedHashMap;

public class Eg5 {

	public static void main(String[] args) {


		LinkedHashMap<Integer,String> hashmap = new LinkedHashMap<>();
		hashmap.put(2, "NameTwo");
		hashmap.put(3, "NameThree");
		hashmap.put(null, "NameOne");
		hashmap.put(null, "NameFour");
		hashmap.put(1, null); 
		hashmap.put(4, null);
		System.out.println(hashmap); //{2=NameTwo, 3=NameThree, null=NameFour, 1=null, 4=null}

		

	}

}
