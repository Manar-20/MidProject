package com.exampleMidPoject.FarasanTrip.Service.Implementation;

import com.exampleMidPoject.FarasanTrip.Entity.Admin;
import com.exampleMidPoject.FarasanTrip.Entity.FarasanTrip;
import com.exampleMidPoject.FarasanTrip.Repository.FarasanTripRepository;
import com.exampleMidPoject.FarasanTrip.Service.Interfaces.FarasanTripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FarasanTripImplementation implements FarasanTripService {
    @Autowired
    FarasanTripRepository farasanTripRepo;

    @Override
    public FarasanTrip addNewTrip(FarasanTrip trip) {
        return farasanTripRepo.save(trip);
    }

    @Override
    public List<FarasanTrip> getAllTrips() {
        return farasanTripRepo.findAll();
    }

    @Override
    public String updateTripById(String farryName, FarasanTrip farasanTrip) {
        Optional<FarasanTrip> optionalFarasanTrip = farasanTripRepo.findById(farryName);

        if (optionalFarasanTrip.isPresent()) {
            FarasanTrip trip = optionalFarasanTrip.get();
            trip.setFarryName(farasanTrip.getFarryName());
            farasanTripRepo.save(trip);
            return "Information Updated";
        }

        return "Information UnUpdated";
    }


}
