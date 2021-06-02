package test;

import com.github.javafaker.Faker;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to LowFeeRent!");
		
		
		Faker faker = new Faker();

		String name = faker.name().fullName(); // Miss Samanta Schmidt
		String surname = faker.name().firstName(); // Emory
		String lastName = faker.name().lastName(); // Barton

		String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
		
		
	}

}
