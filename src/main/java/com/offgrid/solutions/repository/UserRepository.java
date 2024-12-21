package com.offgrid.solutions.repository;

import com.offgrid.solutions.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    // Custom query method to find a user by username

    User findByUsername(String username);
}
