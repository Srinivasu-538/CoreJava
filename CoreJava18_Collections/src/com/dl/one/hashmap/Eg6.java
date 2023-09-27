package com.dl.one.hashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Eg6 {

	public static void main(String[] args) {
		
		String s1 = new String("a");
		String s2 = new String("a");

		HashMap<String,String> hashmap = new HashMap<>();
		hashmap.put(s1, "A");
		hashmap.put(s2, "B"); //Duplicate key overrides the value
		System.out.println(hashmap); //{a=B}
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.hashCode()); //97
		System.out.println(s2.hashCode()); //97
		
		IdentityHashMap<String,String> identityhashmap = new IdentityHashMap<>();
		identityhashmap.put(s1, "A");
		identityhashmap.put(s2, "B"); //Duplicate key will not overrides the value
		System.out.println(identityhashmap); //{a=A, a=B}
		
		System.out.println(s1 == s2); //true
		System.out.println(System.identityHashCode(s1)); //1651191114
		System.out.println(System.identityHashCode(s2)); //1586600255
		
		}

}
