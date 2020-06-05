package com.danielpsf.labs.keycloaksample.config;

import com.danielpsf.labs.keycloaksample.customer.Customer;
import com.danielpsf.labs.keycloaksample.customer.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class BootstrapApp implements ApplicationRunner {

    private final CustomerRepository customerRepository;

    public void run(ApplicationArguments args) {
        log.info("Bootstrapping started");
        initCustomers();
        log.info("Bootstrapping completed");
    }

    public void initCustomers() {

        Customer customer1 = new Customer();
        customer1.setAddress("1111 potato blvd");
        customer1.setName("Veggie food Ltda.");
        customer1.setServiceRendered("Fried potatoes");
        customerRepository.save(customer1);

        Customer customer2 = new Customer();
        customer2.setAddress("2222 hamburger street");
        customer2.setName("Fast food Ltda.");
        customer2.setServiceRendered("Burger club");
        customerRepository.save(customer2);

        Customer customer3 = new Customer();
        customer3.setAddress("33 sweat-tee street");
        customer3.setName("Drinks Ltda.");
        customer3.setServiceRendered("Sweat tee");
        customerRepository.save(customer3);
    }
}
