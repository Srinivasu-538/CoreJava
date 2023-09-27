package com.dl.one.arraylist;

import java.util.ArrayList;

public class Eg3 {

	public static void main(String[] args) {


		ArrayList<String> list = new ArrayList<>();
		list.add("NameZero");
		list.add("NameOne");
		list.add("NameTwo");
		list.add("NameThree");
		list.add("NameFour");
		list.add("NameFive");
		System.out.println(list);  //[NameZero, NameOne, NameTwo, NameThree, NameFour, NameFive]
		
		System.out.println(list.get(0)); //NameZero
		System.out.println(list.get(2)); //NameTwo
		System.out.println(list.get(5)); //NameFive
		//System.out.println(list.get(10)); //java.lang.IndexOutOfBoundsException
		
		System.out.println(list.remove(0)); //NameZero
		System.out.println(list.get(0));
	}

}
