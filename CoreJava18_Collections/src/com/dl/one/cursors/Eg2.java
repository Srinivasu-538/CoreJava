package com.dl.one.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Eg2 {

	public static void main(String[] args) {


		ArrayList<String> list = new ArrayList<>();	

		list.add("NameOne");
		list.add("Nametwo");
		list.add("NameThree");
		list.add("NameFour");
		
		System.out.println(list);
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
			
	}

}
