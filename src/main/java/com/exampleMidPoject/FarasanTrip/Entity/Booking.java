package com.exampleMidPoject.FarasanTrip.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Booking {
    @Id
    private Long BookingId;
    @ManyToOne
    private User user;
    @ManyToOne
    private FarasanTrip trip;
    private int availableSeats;
    private LocalDate bookingDate;

}
