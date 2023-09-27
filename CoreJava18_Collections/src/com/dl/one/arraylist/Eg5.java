package com.dl.one.arraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class Eg5 {

	public static void main(String[] args) {


		ArrayList<String> arraylist = new ArrayList<>();
		arraylist.add("NameZero");
		arraylist.add("NameOne");
		arraylist.add("NameTwo");
		arraylist.add("NameThree");
		arraylist.add("NameFour");
		arraylist.add("NameFive");
		arraylist.add("NameZero");
		arraylist.add("NameOne");
		arraylist.add("NameTwo");
		System.out.println(arraylist);
		System.out.println(arraylist.size());
		
		HashSet<String> hashset = new HashSet<>(arraylist);
		System.out.println(hashset);
		System.out.println(hashset.size());
		

	}

}
