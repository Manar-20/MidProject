package com.exampleMidPoject.FarasanTrip.Service.Implementation;

import com.exampleMidPoject.FarasanTrip.Entity.Customer;
import com.exampleMidPoject.FarasanTrip.Repository.CustomerRepository;
import com.exampleMidPoject.FarasanTrip.Service.Interfaces.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustmoerImplementation implements CustomerService {
    @Autowired
    CustomerRepository customerRepo;

    @Override
    public Customer addNewCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public List<Customer> getAllAdmin() {
        return customerRepo.findAll();
    }

    @Override
    public String deleteByUserId(Long userId) {
        Optional<Customer> customerOptional=customerRepo.findByUserId(userId);
        if (customerOptional.isPresent()){
            customerRepo.deleteById(userId);
            return "Customer is Deleted";
        }else {
            return "The Customer is Not Found";

        }
    }


}


