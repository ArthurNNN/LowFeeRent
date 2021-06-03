package model;

import utils.*;


public class Person {
	private String id;
	private String name;
	private String surname;
	private BankAccount bankAccount;

	public Person() {
		super();
	}

	public Person(String name, String surname, BankAccount bankAccount) {
		super();
		this.setId();
		this.name = name;
		this.surname = surname;
		this.bankAccount = bankAccount;
	}

	public String getId() {
		return id;
	}
	
	public String setId() {
		return this.id = "u" + Utils.generateId();
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "\nPerson [id=" + getId() + ", name=" + name + ", surname=" + surname + ", bankAccount:" + bankAccount + "]";
	}



}
