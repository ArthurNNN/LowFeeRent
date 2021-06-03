package model;

public class Tenant extends Person {

	Request requestForApartment;

	public Tenant() {
		super();
		this.setId();
	}

	public Tenant(Request requestForApartment) {
		super();
		this.setId();
		this.requestForApartment = requestForApartment;
	}

	public Request getRequestForApartment() {
		return requestForApartment;
	}

	public void setRequestForApartment(Request requestForApartment) {
		this.requestForApartment = requestForApartment;
	}

	@Override
	public String toString() {
		return "Tenant [requestForApartment:" + requestForApartment + "]" + super.toString();
	}
}
