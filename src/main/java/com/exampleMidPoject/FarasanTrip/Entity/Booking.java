package com.exampleMidPoject.FarasanTrip.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    private Long BookingId;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private FarasanTrip trip;
    private LocalDate bookingDate;
// This class represents a Booking entity in the system, which is used to store booking information.
}
