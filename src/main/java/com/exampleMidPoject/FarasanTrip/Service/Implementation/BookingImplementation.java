package com.exampleMidPoject.FarasanTrip.Service.Implementation;

import com.exampleMidPoject.FarasanTrip.Entity.Admin;
import com.exampleMidPoject.FarasanTrip.Entity.Booking;
import com.exampleMidPoject.FarasanTrip.Entity.FarasanTrip;
import com.exampleMidPoject.FarasanTrip.Repository.BookingRepository;
import com.exampleMidPoject.FarasanTrip.Repository.FarasanTripRepository;
import com.exampleMidPoject.FarasanTrip.Service.Interfaces.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Service
public class BookingImplementation implements BookingService {
    @Autowired
    private BookingRepository bookingRepo;
    @Autowired
    FarasanTripRepository farasanTripRepository;

    // This method is used to create a new booking.
    @Override
    @ResponseStatus(HttpStatus.CREATED)
    public String createNewBooking(Booking booking) {
        FarasanTrip bookedFerry = booking.getTrip();
// Check if there are available seats for the booked trip.
        if (bookedFerry.getAvailableSeats() > 0) {
            int seat=bookedFerry.getAvailableSeats();
            bookedFerry.setAvailableSeats(bookedFerry.getAvailableSeats()-1);
            farasanTripRepository.save(bookedFerry);
            bookingRepo.save(booking);
            return "Booking added successfully.";
        } else {
            // If there are no available seats, throw an exception with a message.
            throw new IllegalArgumentException("No available seats for this trip.");
        }
    }
    // This method retrieves a list of all bookings in the system.
    @Override
    public List<Booking> getAllBooking() {
        return bookingRepo.findAll();
    }
}




