package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class CustomerEntity implements Runnable{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int customerRetrievalRate;

    public CustomerEntity(int customerRetrievalRate, String name) {
        this.customerRetrievalRate = customerRetrievalRate;
        this.name = name;
    }

    public CustomerEntity() {

    }

    @Override
    public void run() {

    }
}
