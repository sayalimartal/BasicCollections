//Add student names to a linked hashset and print them
package com.collection;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<String> linkedhashset=new LinkedHashSet<>(); //Create a linked hashset
		
		linkedhashset.add("Sayali"); //Adding names to linked hashset
		linkedhashset.add("Siddhi");
		linkedhashset.add("Nishad");
		linkedhashset.add("Drishti");
		linkedhashset.add("Anindya");
		
		//Iterating through the set and displaying each name
		linkedhashset.stream().forEach((name) -> System.out.println(name));
	}

}
