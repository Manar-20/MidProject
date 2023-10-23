package com.exampleMidPoject.FarasanTrip.Controllar;

import com.exampleMidPoject.FarasanTrip.Entity.Customer;
import com.exampleMidPoject.FarasanTrip.Entity.FarasanTrip;
import com.exampleMidPoject.FarasanTrip.Service.Implementation.CustmoerImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerControllar {
    @Autowired
    CustmoerImplementation custmoerImpl;
    @PostMapping("/new-Customer")
    public Customer addNewCustomer(@RequestBody Customer customer) {
        return custmoerImpl.addNewCustomer(customer);
    }
}
