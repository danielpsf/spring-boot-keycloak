package com.danielpsf.labs.keycloaksample.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerRepository customerRepository;

    @GetMapping(path = "/")
    public String index() {
        return "external";
    }

    @GetMapping(path = "/customers")
    public String customers(Principal principal, Model model) {
        Iterable<Customer> customers = customerRepository.findAll();
        model.addAttribute("customers", customers);
        model.addAttribute("username", principal.getName());
        return "customers";
    }

    @GetMapping(path = "/logout")
    public String customers(HttpServletRequest request) throws ServletException {
        request.logout();
        return "external";
    }
}
