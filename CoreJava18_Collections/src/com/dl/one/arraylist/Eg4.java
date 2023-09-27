package com.dl.one.arraylist;

import java.util.ArrayList;

public class Eg4 {

	public static void main(String[] args) {


		ArrayList<String> arraylist = new ArrayList<>();
		arraylist.add("NameZero");
		arraylist.add("NameOne");
		arraylist.add("NameTwo");
		arraylist.add("NameThree");
		arraylist.add("NameFour");
		arraylist.add("NameFive");
		System.out.println(arraylist); //[NameZero, NameOne, NameTwo, NameThree, NameFour, NameFive]

		ArrayList<String> list = new ArrayList<>(arraylist);
		list.add("NameSix");
		list.add("NameSeven");
		list.add("NameEight");
		System.out.println(list);
		
	}

}
