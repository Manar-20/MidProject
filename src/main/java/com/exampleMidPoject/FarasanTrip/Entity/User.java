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
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class User {
    @Id
    private Long userId;
    private String username;
    private String email;
    //private String password;
    private String role;

}
