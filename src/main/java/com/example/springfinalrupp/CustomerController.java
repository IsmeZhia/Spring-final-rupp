package com.example.springfinalrupp;

import com.example.springfinalrupp.dto.CustomerCreateRequest;
import com.example.springfinalrupp.dto.CustomerResponse;
import com.example.springfinalrupp.dto.CustomerUpdateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {
    private final CustomerService customerService;

    // Create a new customer
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    CustomerResponse create(@RequestBody CustomerCreateRequest request) {
        return customerService.createCustomer(request);
    }

    // Update an existing customer
    @PutMapping("/{id}")
    CustomerResponse update(@PathVariable Long id, @RequestBody CustomerUpdateRequest request) {
        return customerService.UpdateCustomer(id, request);
    }

    // Get all customers
    @GetMapping
    List<CustomerResponse> getAll() {
        return customerService.findAllCustomer();
    }

    // Get a customer by id
    @GetMapping("/{id}")
    Optional<Customer> getById(@PathVariable Long id) {
        return customerService.findCustomerById(id);
    }
}
