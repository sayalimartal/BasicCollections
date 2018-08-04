//Add various instances of Car to a treeset and display their details
package com.collection.set;


import java.util.TreeSet;

import com.collection.list.Car;

public class TestTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Car> car=new TreeSet<>(); //Create a Treeset
		
		car.add(new Car("Toyota", "Etios", 20010, 230000)); //Add Car objects
		car.add(new Car("BMW", "4567", 2014, 470000));
		car.add(new Car("Audi", "8", 2017, 2023000));
		
		car.stream().forEach((name) -> System.out.println(name)); //Display all details
		
	}

}
