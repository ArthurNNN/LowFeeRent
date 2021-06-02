package model;

import utils.Utils;

public class Apartment {
	String id;
	int price;
	int area;
	int rooms;
	int bathrooms;

	public Apartment() {
		super();
	}

	public Apartment(int price, int area, int rooms, int bathrooms) {
		super();
		this.id = "a" + Utils.generateId();
		this.price = price;
		this.area = area;
		this.rooms = rooms;
		this.bathrooms = bathrooms;
	}

}
