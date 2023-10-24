package com.exampleMidPoject.FarasanTrip.Controllar;

import com.exampleMidPoject.FarasanTrip.Entity.Admin;
import com.exampleMidPoject.FarasanTrip.Entity.FarasanTrip;
import com.exampleMidPoject.FarasanTrip.Service.Implementation.FarasanTripImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class FarasanTripControllar {
    @Autowired
   private FarasanTripImplementation farasanTripImpl;

    @PostMapping("/add-new-Trip")
    public String addNewTrip(@RequestBody FarasanTrip trip) {
       try {
        farasanTripImpl.addNewTrip(trip);
           String message = "Trip created Successful";
           return message ;
       }
       catch(Exception e){
           String errorMessage ="Trip created Unsuccessful" +e.getMessage();
           return errorMessage;

       }
    }
    @GetMapping("/trips")
    public List<FarasanTrip> getAllTrips(){
        return farasanTripImpl.getAllTrips();
    }
    @PutMapping("/Update-Trip_Info/{farryName}")
    public String updateTrip(@PathVariable String farryName, @RequestBody FarasanTrip  farasanTrip) {
         farasanTripImpl.updateTripById(farryName, farasanTrip);
        try {
            farasanTripImpl.updateTripById(farryName, farasanTrip);
            String message = "Trip Information is Updated";
            return message ;
        }
        catch(Exception e){
            String errorMessage ="Trip Information Not Updated" +e.getMessage();
            return errorMessage;

        }
    }
}
