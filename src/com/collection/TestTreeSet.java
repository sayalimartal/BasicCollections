//Add student names to a treeset and display them
package com.collection;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> treeset=new TreeSet<>(); //Create a treeset
		
		treeset.add("Sayali"); //Adding names to treeset
		treeset.add("Siddhi");
		treeset.add("Nishad");
		treeset.add("Drishti");
		treeset.add("Anindya");
		
		//Iterating through the set and displaying each name
		treeset.stream().forEach((name) -> System.out.println(name));

	}

}
