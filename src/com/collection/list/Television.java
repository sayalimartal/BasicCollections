//Class to hold a Television instance
package com.collection.list;

public class Television {
	//Instance members
	String company;
	String type;
	boolean is3dEnabled;
	int price;
	
	public Television(String company, String type, boolean is3dEnabled, int price) {
		super();
		this.company = company;
		this.type = type;
		this.is3dEnabled = is3dEnabled;
		this.price = price;
	}

	//Overriding equals and hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {  //Company, type and price define equality for television
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (price != other.price)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	//Display television details
	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", is3dEnabled=" + is3dEnabled + ", price=" + price
				+ "]";
	}
	
}
