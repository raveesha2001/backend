package com.example.demo.Model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int ticketId;
    private boolean isSold;
}
