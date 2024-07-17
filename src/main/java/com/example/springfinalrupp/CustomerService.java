package com.example.springfinalrupp;

import com.example.springfinalrupp.dto.CustomerCreateRequest;
import com.example.springfinalrupp.dto.CustomerResponse;
import com.example.springfinalrupp.dto.CustomerUpdateRequest;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    // create Customer
    CustomerResponse createCustomer(CustomerCreateRequest customerCreateRequest);

    // find all customer
    List<CustomerResponse> findAllCustomer();

    //Find Customer by id
    Optional<Customer> findCustomerById(Long id);

    //Update Customer by id
    CustomerResponse UpdateCustomer(Long id, CustomerUpdateRequest customerUpdateRequest);
}
