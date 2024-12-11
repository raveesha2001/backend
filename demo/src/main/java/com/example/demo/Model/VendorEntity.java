package com.example.demo.Model;
import jakarta.persistence.*;

@Entity
@Table
public class VendorEntity implements Runnable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int ticketReleaseRate;

    public VendorEntity(int ticketReleaseRate, String name) {
        this.ticketReleaseRate = ticketReleaseRate;
        this.name = name;
    }

    public VendorEntity() {

    }

    @Override
    public void run() {

    }
}