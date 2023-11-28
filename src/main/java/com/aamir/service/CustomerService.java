package com.aamir.service;

import com.aamir.dto.CustomerRecord;
import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private List<CustomerRecord> customerRecordList = new ArrayList<>();

    @Autowired
    private ObservationRegistry observationRegistry;

    public CustomerRecord addCustomer(CustomerRecord customerRecord) {
        customerRecordList.add(customerRecord);
        return Observation.createNotStarted("addCustomer", observationRegistry)
                .observe(() -> customerRecord);
    }

    public List<CustomerRecord> getCustomerRecordList() {
        return Observation.createNotStarted("getAllCustomer", observationRegistry)
                .observe(() -> customerRecordList);
    }

    public CustomerRecord findCustmCustomerRecord(int id) {
        return
                Observation.createNotStarted("getCustomer", observationRegistry)
                        .observe(() -> customerRecordList.stream()
                                .filter(customerRecord -> customerRecord.id() == id)
                                .findAny().orElseThrow(() -> new RuntimeException("Customer not found id" + id)));


    }
}
