package com.danielpsf.labs.keycloaksample.customer;

import com.danielpsf.labs.keycloaksample.customer.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CustomerRepository extends CrudRepository<Customer, UUID> {
}
