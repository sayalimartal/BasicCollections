//Class to hold a Car instance
package com.collection.list;

public class Car implements Comparable<Car> {
	//Instance members
	String make;
	String model;
	int year;
	int price;
	
	public Car(String make, String model, int year, int price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	//Overriding equals and hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) { //Make and model define equality for car
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	//Overriding compareTo to compare cars depending on their make
	@Override
	public int compareTo(Car car) {
		return this.make.compareTo(car.make);
	}

	//Display car details
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
}
