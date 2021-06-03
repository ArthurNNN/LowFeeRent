package model;

public class Lessor extends Person {

	Apartment apartment;

	public Lessor() {
		super();
	}

	public Lessor(Apartment apartment) {
		super();
		this.setId();
		this.apartment = apartment;
	}

//	public void setId(String id) {
//		// TODO Auto-generated method stub
//		this. = "u" + Utils.generateId();
//	}

	public Apartment getApartment() {
		return apartment;
	}

	public void setApartment(Apartment apartment) {
		this.apartment = apartment;
	}

	@Override
	public String toString() {
		return "Lessor [apartment:" + apartment + "]" + super.toString();
	}

}
