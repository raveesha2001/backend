package com.example.demo.Repo;

import com.example.demo.Model.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<CustomerEntity,Long> {
}
