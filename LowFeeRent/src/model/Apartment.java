package model;

import utils.Utils;

public class Apartment {
	String id;
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

	@Override
	public String toString() {
		return "\nApartment [id=" + id + ", price=" + price + ", area=" + area + ", rooms=" + rooms + ", bathrooms="
				+ bathrooms + ", address=" + address + "]";
	}

}
