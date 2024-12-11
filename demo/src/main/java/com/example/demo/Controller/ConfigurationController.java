package com.example.demo.Controller;

import com.example.demo.Model.ConfigurationEntity;
import com.example.demo.Service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "api/v1")
public class ConfigurationController {

    @Autowired
    private ConfigurationService configurationService;

    @PostMapping("create-configuration")
    public void createConfiguration(
            @RequestParam("totalNoOfTickets") int totalNoOfTickets,
            @RequestParam("ticketReleaseRate") int ticketReleaseRate,
            @RequestParam("customerRetrievalRate") int customerRetrievalRate,
            @RequestParam("maxTicketCapacity") int maxTicketCapacity,
            @RequestParam("numberOfVendors") int numberOfVendors,
            @RequestParam("numberOfCustomers") int numberOfCustomers

    ) {
        ConfigurationEntity createdConfiguration = configurationService.create(new ConfigurationEntity(totalNoOfTickets, ticketReleaseRate, customerRetrievalRate, maxTicketCapacity,numberOfVendors,numberOfCustomers));
    }


}
