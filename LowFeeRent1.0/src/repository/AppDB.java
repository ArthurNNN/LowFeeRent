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

	public static String location;
	public static int size;

	public AppDB() {
		super();
		this.lessors = new HashMap<String, Lessor>();
		this.tenants = new HashMap<String, Tenant>();
		this.apartments = new HashMap<String, Apartment>();
		this.requests = new HashMap<String, Request>();
	}

	public HashMap<String, Lessor> getLessors() {
		return lessors;
	}

	public void setLessors(HashMap<String, Lessor> lessors) {
		this.lessors = lessors;
	}

	public HashMap<String, Tenant> getTenants() {
		return tenants;
	}

	public void setTenants(HashMap<String, Tenant> tenants) {
		this.tenants = tenants;
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

	public static String getLocation() {
		return location;
	}

	public static void setLocation(String location) {
		AppDB.location = location;
	}

	public static int getSize() {
		return size;
	}

	public static void setSize(int size) {
		AppDB.size = size;
	}

}
