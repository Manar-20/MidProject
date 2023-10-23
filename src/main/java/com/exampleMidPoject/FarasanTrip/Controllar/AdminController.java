package com.exampleMidPoject.FarasanTrip.Controllar;

import com.exampleMidPoject.FarasanTrip.Entity.Admin;
import com.exampleMidPoject.FarasanTrip.Entity.FarasanTrip;
import com.exampleMidPoject.FarasanTrip.Service.Implementation.AdminImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    AdminImplementation adminImpl;
                                                                                     @PostMapping("/create-Admin")
    public String createNewAdmin(@RequestBody Admin admin) {
        try {
            adminImpl.createNewAdmin(admin);
            String message = "Admin created Successful";
            return message ;
        }
        catch(Exception e){
            String errorMessage ="Admin created Unsuccessful" +e.getMessage();
            return errorMessage;

        }
    }

    @GetMapping("/Admins")
    public List<Admin> Admin(){

        return adminImpl.getAllAdmin();
    }


}
