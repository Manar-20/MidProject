package com.exampleMidPoject.FarasanTrip.Controllar;

import com.exampleMidPoject.FarasanTrip.Entity.Admin;
import com.exampleMidPoject.FarasanTrip.Entity.Booking;
import com.exampleMidPoject.FarasanTrip.Entity.FarasanTrip;
import com.exampleMidPoject.FarasanTrip.Repository.BookingRepository;
import com.exampleMidPoject.FarasanTrip.Repository.FarasanTripRepository;
import com.exampleMidPoject.FarasanTrip.Service.Implementation.BookingImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingControllar {
    @Autowired
    private BookingImplementation bookingImpl;
    @Autowired
    FarasanTripRepository farasanTripRepository;
    @Autowired
    BookingRepository bookingRepository;
    @PostMapping("/Add-new-booking")
    public String createNewBooking(@RequestBody Booking booking) {
        try {
            bookingImpl.createNewBooking(booking);
            String message = "Booking Added Successful";
            return message ;
        }
        catch(Exception e){
            String errorMessage ="Booking Added Unsuccessful" +e.getMessage();
            return errorMessage;

        }

    }

    @GetMapping("/All_Booking")
    public List<Booking> booking(){
        return bookingImpl.getAllBooking();
    }
}
