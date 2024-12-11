package com.example.demo.Repo;

import com.example.demo.Model.VendorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepo extends JpaRepository<VendorEntity,Long> {

}
