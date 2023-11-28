package com.aamir.controller;

import com.aamir.dto.CustomerRecord;
import com.aamir.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/add-customer")
    public CustomerRecord addCustomer(@RequestBody CustomerRecord customerRecord) {
        return customerService.addCustomer(customerRecord);
    }

    @GetMapping("/get-all-customer")
    public List<CustomerRecord> getAllCustomer() {
        return customerService.getCustomerRecordList();
    }

    @GetMapping("/get-customer/{id}")
    public CustomerRecord getCustomerById(@PathVariable int id) {
        return customerService.findCustmCustomerRecord(id);
    }
}
