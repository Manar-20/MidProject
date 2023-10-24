package com.exampleMidPoject.FarasanTrip.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@NoArgsConstructor
public class Customer extends User {

    public Customer(Long userId, String username, String email, String role) {
        super(userId, username, email, role);
    }
    // The constructor initializes a Customer object with a user ID, username, email, and role by calling the constructor of the parent User class.
}
