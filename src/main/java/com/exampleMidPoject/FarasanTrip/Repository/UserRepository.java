package com.exampleMidPoject.FarasanTrip.Repository;

import com.exampleMidPoject.FarasanTrip.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
