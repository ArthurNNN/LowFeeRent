package test;

import java.time.LocalDate;
import java.util.HashMap;
import com.github.javafaker.Faker;
import model.*;
import repository.AppDB;
import utils.*;

public class Test {
	public static void main(String[] args) {

		System.out.println("Welcome to LowFeeRent!\n");

		AppDB db = new AppDB();
		Faker faker = new Faker();

		System.out.println("---------------- Lessors: ----------------");
		int n = 1;
		while (n <= 10) {
			Lessor lessor = new Lessor();
			lessor.setName(faker.name().firstName());
			lessor.setSurname(faker.name().lastName());
			lessor.setEmail(faker.internet().emailAddress());
			lessor.setBankAccount(new BankAccount(faker.finance().iban(), Utils.randRange(5, 55) * 100));

			Apartment apartment = new Apartment(Utils.randRange(8, 25) * 100, Utils.randRange(10, 20) * 10,
					Utils.randRange(1, 5), Utils.randRange(1, 3), faker.address().streetAddress(true));

			HashMap<LocalDate, LocalDate> dates = new HashMap<LocalDate, LocalDate>();
			dates.put(LocalDate.of(2021, Utils.randRange(1, 4), Utils.randRange(1, 28)),
					LocalDate.of(2021, Utils.randRange(3, 4), Utils.randRange(1, 28)));
			dates.put(LocalDate.of(2021, Utils.randRange(5, 8), Utils.randRange(1, 28)),
					LocalDate.of(2021, Utils.randRange(7, 8), Utils.randRange(1, 28)));
			dates.put(LocalDate.of(2021, Utils.randRange(9, 12), Utils.randRange(1, 28)),
					LocalDate.of(2021, Utils.randRange(10, 12), Utils.randRange(1, 28)));
			apartment.setOpenDates(dates);

			apartment.setPersonId(lessor.getId());
			lessor.setApartmentId(apartment.getId());

			db.getLessors().put(lessor.getId(), lessor);
			db.getApartments().put(apartment.getId(), apartment);
			System.out.println("\n#" + n + " " + lessor);
			System.out.println(apartment);
			n++;
		}

		n = 1;
		System.out.println("\n---------------- Tenants: ----------------");
		while (n <= 10) {

			Tenant tenant = new Tenant();
			tenant.setName(faker.name().firstName());
			tenant.setSurname(faker.name().lastName());
			tenant.setEmail(faker.internet().emailAddress());
			tenant.setBankAccount(new BankAccount(faker.finance().iban(), Utils.randRange(25, 75) * 100));

			Request request = new Request(
					LocalDate.of(2021, Utils.randRange(5, 6), Utils.randRange(1, 28)),
					LocalDate.of(2021, Utils.randRange(6, 7), Utils.randRange(1, 28)), 
					Utils.randRange(5, 18) * 100,
					Utils.getRandomBoolean() ? Utils.randRange(8, 10) * 10 : 0,
					Utils.getRandomBoolean() ? Utils.randRange(1, 5) : 0,
					Utils.getRandomBoolean() ? Utils.randRange(1, 3) : 0);

			request.setPersonId(tenant.getId());
			tenant.setRequestId(request.getId());
			db.getTenants().put(tenant.getId(), tenant);
			db.getRequests().put(request.getId(), request);
			System.out.println("\n#" + n + " " + tenant);
			System.out.println(request);
			n++;
		}

		n = 1;
		System.out.println("\n---------------- Matching Apartments & Requests: ----------------");
		for (String keyReq : db.getRequests().keySet()) {
			Request request = db.getRequests().get(keyReq);

			for (String keyApt : db.getApartments().keySet()) {
				Apartment apartment = db.getApartments().get(keyApt);

				if (apartment.getPrice() <= request.getPriceMax() && apartment.getArea() >= request.getAreaMin()
						&& apartment.getRooms() >= request.getRoomsMin()
						&& apartment.getBathrooms() >= request.getBathroomsMin()) {

					for (LocalDate date1 : apartment.getOpenDates().keySet()) {

						LocalDate date2 = apartment.getOpenDates().get(date1);

						if ((date1.isBefore(request.getCheckin()) || date1.equals(request.getCheckin()))
								&& (date2.isAfter(request.getCheckout()) || date2.equals(request.getCheckout()))) {

							System.out.println("\n#" + n + " Match Request " + request.getId() + " & Apartment "
									+ apartment.getId());
							System.out.println(request);
							System.out.println(apartment);
							n++;
						}
					}
				}
			}
		}
	}
}
