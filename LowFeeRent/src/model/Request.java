package model;

import utils.Utils;

public class Request {
	String id;
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

	@Override
	public String toString() {
		return "\nRequest [id=" + id + ", priceMax=" + priceMax + ", areaMin=" + areaMin + ", roomsMin=" + roomsMin
				+ ", bathroomsMin=" + bathroomsMin + "]";
	}

}
