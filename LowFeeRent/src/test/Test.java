package test;

import java.util.ArrayList;
import java.util.HashMap;
import com.github.javafaker.Faker;
import model.*;
import repository.AppDB;
import utils.*;

public class Test {
	public static void main(String[] args) {

		System.out.println("Welcome to LowFeeRent!\n");

		generateData();

	}

	private static void generateData() {

		AppDB db = new AppDB();

		Faker faker = new Faker();

		//ArrayList<Lessor> lessors = new ArrayList<Lessor>();
		System.out.println("---------------- Lessors: ----------------");
		int n = 1;
		while (n <= 10) {
			Lessor lessor = new Lessor();
			lessor.setName(faker.name().firstName());
			lessor.setSurname(faker.name().lastName());
			lessor.setBankAccount(new BankAccount(faker.finance().iban(), Utils.randRange(5, 55) * 100));

			Apartment apartment = new Apartment(Utils.randRange(8, 25) * 100, Utils.randRange(10, 20) * 10,
					Utils.randRange(1, 5), Utils.randRange(1, 3), faker.address().streetAddress(true));
			apartment.setPersonId(lessor.getId());
			lessor.setApartmentId(apartment.getId());
			db.getLessors().put(lessor.getId(), lessor);
			db.getApartments().put(apartment.getId(), apartment);

			System.out.println("\n#" + n + " " + lessor);
			System.out.println(apartment);

			n++;
		}

		n = 1;
		//ArrayList<Person> tenants = new ArrayList<Person>();
		System.out.println("---------------- Tenants: ----------------");
		while (n <= 10) {
			
			
			Tenant tenant = new Tenant();
			tenant.setName(faker.name().firstName());
			tenant.setSurname(faker.name().lastName());
			
			tenant.setBankAccount(new BankAccount(faker.finance().iban(), Utils.randRange(25, 75) * 100));

			Request request = new Request(Utils.randRange(5, 18) * 100,
					Utils.getRandomBoolean() ? Utils.randRange(8, 10) * 10 : null,
					Utils.getRandomBoolean() ? Utils.randRange(1, 5) : null,
					Utils.getRandomBoolean() ? Utils.randRange(1, 3) : null);
			request.setPersonId(tenant.getId());
			tenant.setRequestId(request.getId());
			db.getTenants().put(tenant.getId(), tenant);
			db.getRequests().put(request.getId(), request);

			System.out.println("\n#" + n + " " + tenant);
			System.out.println(request);

			n++;	
					
		}
	}
}
