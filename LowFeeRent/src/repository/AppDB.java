package repository;

import java.util.HashMap;


import model.Apartment;
import model.Lessor;
import model.Request;
import model.Tenant;

public class AppDB {
	private HashMap<String, Lessor> lessors;
	private HashMap<String, Tenant> tenants;
	private HashMap<String, Apartment> apartments;
	private HashMap<String, Request> requests;

	public String location;
	public int size;
		
	public AppDB() {
		super();
	}

	public AppDB(HashMap<String, Apartment> apartments, HashMap<String, Request> requests) {
		super();
		this.apartments = apartments;
		this.requests = requests;
	}

	public HashMap<String, Apartment> getApartments() {
		return apartments;
	}

	public void setApartments(HashMap<String, Apartment> apartments) {
		this.apartments = apartments;
	}

	public HashMap<String, Request> getRequests() {
		return requests;
	}

	public void setRequests(HashMap<String, Request> requests) {
		this.requests = requests;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}
