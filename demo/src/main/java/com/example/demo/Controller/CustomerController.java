package com.example.demo.Controller;

import com.example.demo.Model.CustomerEntity;
import com.example.demo.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping("/create-user")
    public void createUser() {
        customerService.create(new CustomerEntity(5,"Raveesha"));
    }
}
