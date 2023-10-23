package com.exampleMidPoject.FarasanTrip.Service.Implementation;

import com.exampleMidPoject.FarasanTrip.Entity.Customer;
import com.exampleMidPoject.FarasanTrip.Repository.CustomerRepository;
import com.exampleMidPoject.FarasanTrip.Service.Interfaces.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustmoerImplementation implements CustomerService {
    @Autowired
    CustomerRepository customerRepo;

    @Override
    public Customer addNewCustomer(Customer customer) {
        return customerRepo.save(customer);
    }
}
