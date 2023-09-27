package com.dl.one.vector;

import java.util.Vector;

public class Eg2 {

	public static void main(String[] args) {


		Vector<String> vector = new Vector<>();
	
		vector.addElement("NameOne");
		vector.addElement("NameTwo");
		vector.addElement("NameThree");
		vector.addElement("NameFour");
		vector.addElement("NameFive");
		vector.addElement("NameSix");
		System.out.println(vector);
		
		System.out.println(vector.firstElement());
		
		System.out.println(vector.lastElement());
		
		vector.clear();
		System.out.println(vector);
	}

}
