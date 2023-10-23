package com.exampleMidPoject.FarasanTrip.Service.Implementation;

import com.exampleMidPoject.FarasanTrip.Entity.Admin;
import com.exampleMidPoject.FarasanTrip.Repository.AdminRepository;
import com.exampleMidPoject.FarasanTrip.Service.Interfaces.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminImplementation implements AdminService {
    @Autowired
    AdminRepository adminRepo;


    @Override
    public List<Admin> getAllAdmin() {
        return adminRepo.findAll();
    }
}
