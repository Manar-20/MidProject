package com.exampleMidPoject.FarasanTrip.Entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@NoArgsConstructor
public class Admin extends User {

    public Admin(Long userId, String username, String email, String role) {
        super(userId, username, email, role);
    }
}
