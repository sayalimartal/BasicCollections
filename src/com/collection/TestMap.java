//Add student names and their favorite fruits to a map and print them
package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		
		Map<String,String> map=new HashMap<>(); //Create a hashmap
		
		map.put("Sayali", "Apple"); //Adding names and favorite fruits to hashmap
		map.put("Siddhi", "Mango");
		map.put("Nishad", "Grapes");
		map.put("Drishti", "Watermelon");
		
		Set<Entry<String,String>> set= map.entrySet();
		
		//Display names and favorite fruits using entryset
		set.stream().forEach((e) -> System.out.println(e.getKey()+" "+e.getValue()));
		
		Set<String> keyset=map.keySet();
		
		//Display key values using keyset
		System.out.println("Key set values are: "+keyset);
		
	}

}
