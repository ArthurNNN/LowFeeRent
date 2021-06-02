package test;

import java.util.ArrayList;
import com.github.javafaker.Faker;
import model.BankAccount;
import model.Person;

public class Test {

	public static void main(String[] args) {
		int n = 0;

		System.out.println("Welcome to LowFeeRent!");

		Faker faker = new Faker();

		ArrayList<Person> lessors = new ArrayList<Person>();
		ArrayList<Person> tenants = new ArrayList<Person>();

		while (n < 10) {
			String name = faker.name().firstName();
			String surname = faker.name().lastName();
			String iban = faker.finance().iban();
			lessors.add(new Person(name, surname, new BankAccount(iban, Math.random() * 1000)));
		}
		
		System.out.println(lessors);
	}
}
