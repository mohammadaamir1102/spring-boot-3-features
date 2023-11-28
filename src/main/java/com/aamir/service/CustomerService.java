package com.aamir.service;

import com.aamir.dto.CustomerRecord;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private List<CustomerRecord> customerRecordList = new ArrayList<>();

    public CustomerRecord addCustomer(CustomerRecord customerRecord) {
        customerRecordList.add(customerRecord);
        return customerRecord;
    }

    public List<CustomerRecord> getCustomerRecordList() {
        return customerRecordList;
    }

    public CustomerRecord findCustmCustomerRecord(int id) {
        return customerRecordList.stream().filter(customerRecord -> customerRecord.id() == id)
                .findAny().orElseThrow(() -> new RuntimeException("Customer not found id" + id));
    }
}
