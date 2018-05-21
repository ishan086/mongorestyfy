package com.monoresty.mongoresty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//repository.deleteAll();

		// save a couple of customers
		repository.save(new Customer("Alice", "secret"));
		repository.save(new Customer("Bob", "secret2"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByUsername("Alice"));

		System.out.println("Customers found with Password('Secret2'):");
		System.out.println("--------------------------------");
		for (Customer customer : repository.findByPassword("secret2")) {
		System.out.println(customer);
		}

	}

}