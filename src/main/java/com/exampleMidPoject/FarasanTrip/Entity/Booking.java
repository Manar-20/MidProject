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

}
