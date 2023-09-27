package com.dl.one.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Eg4 {

	public static void main(String[] args) {


		NavigableSet<Integer> treeset = new TreeSet<>();
		treeset.add(65);
		treeset.add(67);
		treeset.add(66);
		treeset.add(68);
		treeset.add(70);
		treeset.add(68);
		treeset.add(85);
	    System.out.println(treeset); //[65, 66, 67, 68, 70, 85]
	    
	    System.out.println(treeset.descendingSet()); //[85, 70, 68, 67, 66, 65]
	    
	    //greater than or equal to
	    System.out.println(treeset.ceiling(71)); //85
	    
	    //greater than
	    System.out.println(treeset.higher(70)); //85
		
	    //greater than ,less than ,equal to
	    System.out.println(treeset.floor(66)); //66
	    
	    //less than
	    System.out.println(treeset.lower(69)); //68
	    
	    
	    System.out.println(treeset.pollFirst()); //65
	    System.out.println(treeset.pollLast());  //85
		
	}

}
