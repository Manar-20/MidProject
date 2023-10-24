package com.exampleMidPoject.FarasanTrip.Controllar;

import com.exampleMidPoject.FarasanTrip.Entity.Admin;
import com.exampleMidPoject.FarasanTrip.Entity.Customer;
import com.exampleMidPoject.FarasanTrip.Entity.FarasanTrip;
import com.exampleMidPoject.FarasanTrip.Repository.CustomerRepository;
import com.exampleMidPoject.FarasanTrip.Service.Implementation.CustmoerImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class CustomerControllar {
    @Autowired
    CustmoerImplementation custmoerImpl;
    CustomerRepository customerRepo;
    @PostMapping("/new-Customer")
    @ResponseStatus
    public ResponseEntity<String> addNewCustomer(@RequestBody Customer customer) {
        try {
            custmoerImpl.addNewCustomer(customer);
            String message = "Customer created Successful";
            return ResponseEntity.status(HttpStatus.OK).body(message);
        } catch (Exception e) {
            String errorMessage = "Customer created Unsuccessful" + e.getMessage();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
        }
    }
    @GetMapping("/Customer")
    public List<Customer> customers(){
        return custmoerImpl.getAllAdmin();
    }
    @DeleteMapping("/delete/{userId}")
    @ResponseStatus
    public ResponseEntity<String> deleteCustomer(@PathVariable Long userId) {
        try {
              custmoerImpl.deleteByUserId(userId);
                 String message = "Customer Deleted Successful";
                 return ResponseEntity.status(HttpStatus.OK).body(message);
        } catch (Exception e) {
            String errorMessage = "Customer Delete Unsuccessful" + e.getMessage();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
        }
    }
}
