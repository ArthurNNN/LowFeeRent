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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}

	@Override
	public String toString() {
		return "Apartment [id=" + id + ", personId=" + personId + ", price=" + price + ", area=" + area + ", rooms="
				+ rooms + ", bathrooms=" + bathrooms + ", address=" + address + "]";
	}

}
