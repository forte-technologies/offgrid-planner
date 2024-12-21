package com.offgrid.solutions.repository;

import com.offgrid.solutions.OffgridPlannerApplication;
import com.offgrid.solutions.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = OffgridPlannerApplication.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testCreateAndFindUser() {
        // Create and save a new user
        User user = new User("testuser", "testuser@example.com", "hashed_password", "Test Bio");
        userRepository.save(user);

        // Retrieve the user by username
        User retrievedUser = userRepository.findByUsername("testuser");

        // Verify the user details
        assertNotNull(retrievedUser);
        assertEquals("testuser", retrievedUser.getUsername());
        assertEquals("testuser@example.com", retrievedUser.getEmail());
    }
}
