package com.exampleMidPoject.FarasanTrip.Controllar;

import com.exampleMidPoject.FarasanTrip.Entity.Admin;
import com.exampleMidPoject.FarasanTrip.Entity.FarasanTrip;
import com.exampleMidPoject.FarasanTrip.Service.Implementation.FarasanTripImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class FarasanTripControllar {
    @Autowired
   private FarasanTripImplementation farasanTripImplementation;
    @GetMapping("/trips")
    public List<FarasanTrip> getAllTrips(){
        return farasanTripImplementation.getAllTrips();
    }

    @PostMapping("/add-new-Trip")
    public FarasanTrip addNewTrip(@RequestBody FarasanTrip trip) {
        return farasanTripImplementation.addNewTrip(trip);
    }
}
