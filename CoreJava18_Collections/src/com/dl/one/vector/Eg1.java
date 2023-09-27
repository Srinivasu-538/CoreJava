package com.dl.one.vector;

import java.util.Vector;

public class Eg1 {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<>(); 
		vector.add("NameOne");
		vector.add("NameTwo");
		vector.add("NameThree");
		vector.add("NameFour");
		vector.add("NameFive");
		vector.add("NameOne");
		System.out.println(vector);
		
		Vector<String> v = new Vector<>(vector);
		v.add("NameSix");
		v.add("NameSeven");
		System.out.println(v);

	}

}
