package com.monoresty.mongoresty;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByUsername(String username);
	public List<Customer> findByPassword(String password);
	
}