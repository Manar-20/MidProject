package com.exampleMidPoject.FarasanTrip.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "trips_table")
@Data
public class FarasanTrip {
    @Id
    private String farryName;

    private String ferryCapacity;

    }
