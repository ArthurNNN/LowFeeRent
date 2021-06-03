package model;

import utils.Utils;

public class Request {
	String id;
	String personId;
	int priceMax;
	Integer areaMin;
	Integer roomsMin;
	Integer bathroomsMin;


	public Request() {
		super();
	}

	public Request(int priceMax, Integer areaMin, Integer roomsMin, Integer bathroomsMin) {
		super();
		this.id = "r" + Utils.generateId();
		this.priceMax = priceMax;
		this.areaMin = areaMin;
		this.roomsMin = roomsMin;
		this.bathroomsMin = bathroomsMin;

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
		return "Request [id=" + id + ", priceMax=" + priceMax + ", areaMin=" + areaMin + ", roomsMin=" + roomsMin
				+ ", bathroomsMin=" + bathroomsMin + "]";
	}

}
