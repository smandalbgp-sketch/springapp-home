package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // JpaRepository already gives you: findById, findAll, save, deleteById, etc.
    // Add custom queries here if needed, e.g.:
    // Optional<User> findByEmail(String email);
}
