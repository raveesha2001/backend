package com.example.demo.Service;

import com.example.demo.Model.CustomerEntity;
import com.example.demo.Repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }
    public CustomerEntity create(CustomerEntity customerEntity) {
        return customerRepo.save(customerEntity);
    }
}
