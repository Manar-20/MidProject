package com.exampleMidPoject.FarasanTrip.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users_table")
@AllArgsConstructor
@NoArgsConstructor
@Data
// Entity class for representing user data.
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
// Uses TABLE_PER_CLASS inheritance strategy, which creates a separate table for each subclass.
public class User {
    @Id
    private Long userId;
    private String username;
    private String email;
    //private String password;
    private String role;

}
