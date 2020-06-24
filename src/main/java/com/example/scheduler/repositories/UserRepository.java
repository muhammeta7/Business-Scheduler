package com.example.scheduler.repositories;

import com.example.scheduler.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
