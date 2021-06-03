package model;

import utils.Utils;

public class Apartment {
	String id;
	String personId;
	int price;
	int area;
	int rooms;
	int bathrooms;
	String address;

	public Apartment() {
		super();
	}

	public Apartment(int price, int area, int rooms, int bathrooms, String address) {
		super();
		this.id = "a" + Utils.generateId();
		this.price = price;
		this.area = area;
		this.rooms = rooms;
		this.bathrooms = bathrooms;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	@Override
	public String toString() {
		return "Apartment [id=" + id + ", personId=" + personId + ", price=" + price + ", area=" + area + ", rooms="
				+ rooms + ", bathrooms=" + bathrooms + ", address=" + address + "]";
	}

}
