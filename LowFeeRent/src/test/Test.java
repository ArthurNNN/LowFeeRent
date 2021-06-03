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

		ArrayList<Lessor> lessors = new ArrayList<Lessor>();
		System.out.println("---------------- Lessors: ----------------");
		int n = 1;
		while (n <= 10) {
			Lessor lessor = new Lessor(new Apartment(Utils.randRange(8, 25) * 100, Utils.randRange(10, 20) * 10,
					Utils.randRange(1, 5), Utils.randRange(1, 3), faker.address().streetAddress(true)));
			lessor.setName(faker.name().firstName());
			lessor.setSurname(faker.name().lastName());
			lessor.setBankAccount(new BankAccount(faker.finance().iban(), Utils.randRange(5, 55) * 100));
			
			//db.getApartments().put(lessor.getId(), lessor.getApartment());
			
			System.out.println("#" + n + " " + lessor);
			System.out.println();
			lessors.add(lessor);
			n++;
			
			
		}

		n = 1;
		ArrayList<Person> tenants = new ArrayList<Person>();
		System.out.println("---------------- Tenants: ----------------");
		while (n <= 10) {
			Tenant tenant = new Tenant();
			tenant.setRequestForApartment(
					new Request(Utils.randRange(5, 18) * 100, Utils.getRandomBoolean() ? Utils.randRange(8, 10) * 10 : null,
							Utils.getRandomBoolean() ? Utils.randRange(1, 5) : null,
							Utils.getRandomBoolean() ? Utils.randRange(1, 3) : null));
			tenant.setName(faker.name().firstName());
			tenant.setSurname(faker.name().lastName());
			tenant.setBankAccount(new BankAccount(faker.finance().iban(), Utils.randRange(25, 75) * 100));
			System.out.println("#" + n + " " + tenant);
			System.out.println();
			tenants.add(tenant);
			n++;
		}
	}
}
