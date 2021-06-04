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

	public int getPriceMax() {
		return priceMax;
	}

	public void setPriceMax(int priceMax) {
		this.priceMax = priceMax;
	}

	public Integer getAreaMin() {
		return areaMin;
	}

	public void setAreaMin(Integer areaMin) {
		this.areaMin = areaMin;
	}

	public Integer getRoomsMin() {
		return roomsMin;
	}

	public void setRoomsMin(Integer roomsMin) {
		this.roomsMin = roomsMin;
	}

	public Integer getBathroomsMin() {
		return bathroomsMin;
	}

	public void setBathroomsMin(Integer bathroomsMin) {
		this.bathroomsMin = bathroomsMin;
	}

	@Override
	public String toString() {
		return "Request [id=" + id + ", priceMax=" + priceMax + ", areaMin=" + areaMin + ", roomsMin=" + roomsMin
				+ ", bathroomsMin=" + bathroomsMin + "]";
	}

}
