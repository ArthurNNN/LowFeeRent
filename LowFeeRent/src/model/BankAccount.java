package model;

public class BankAccount {
	String iban;
	double amount;
	
	public BankAccount(String iban, double amount) {
		super();
		this.iban = iban;
		this.amount = amount;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "\nBankAccount [iban=" + iban + ", amount=" + amount + "]";
	}



}
