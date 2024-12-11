package com.example.demo.Service;

import com.example.demo.Model.VendorEntity;
import com.example.demo.Repo.VendorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorService {
    private VendorRepo vendorRepo;

    @Autowired
    public VendorService(VendorRepo vendorRepo) {
        this.vendorRepo = vendorRepo;
    }

    public VendorEntity createVendor(VendorEntity vendor) {
        return vendorRepo.save(vendor);
    }
}
