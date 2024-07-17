package com.example.springfinalrupp;

import com.example.springfinalrupp.dto.CustomerCreateRequest;
import com.example.springfinalrupp.dto.CustomerResponse;
import com.example.springfinalrupp.dto.CustomerUpdateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    //create customer
    @Override
    public CustomerResponse createCustomer(CustomerCreateRequest customerCreateRequest) {
        Customer newCustomer = Customer.builder()
                .lastName(customerCreateRequest.lastName())
                .firstName(customerCreateRequest.firstName())
                .phone(customerCreateRequest.phone())
                .build();

        return CustomerResponse.builder()
                .lastName(newCustomer.getLastName())
                .firstName(newCustomer.getFirstName())
                .phone(newCustomer.getPhone())
                .build();
    }

    // Find all customer
    @Override
    public List<CustomerResponse> findAllCustomer() {
        return customerRepository.findAll().stream()
                .map(customer -> CustomerResponse.builder()
                        .id(customer.getId())
                        .lastName(customer.getLastName())
                        .firstName(customer.getFirstName())
                        .phone(customer.getPhone())
                        .build()).toList();
    }

    //Find Customer by id
    @Override
    public Optional<Customer> findCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public CustomerResponse UpdateCustomer(Long id, CustomerUpdateRequest customerUpdateRequest) {
        return null;
    }
}
