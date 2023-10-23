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
    @GetMapping("/trips")
    public List<FarasanTrip> getAllTrips(){
        return farasanTripImpl.getAllTrips();
    }

    @PostMapping("/add-new-Trip")
    public FarasanTrip addNewTrip(@RequestBody FarasanTrip trip) {
        return farasanTripImpl.addNewTrip(trip);
    }
    @PutMapping("/Update-Trip_Info/{farryName}")
    public String updateTrip(@PathVariable String farryName, @RequestBody FarasanTrip  farasanTrip) {
        return farasanTripImpl.updateTripById(farryName, farasanTrip);
    }
}
