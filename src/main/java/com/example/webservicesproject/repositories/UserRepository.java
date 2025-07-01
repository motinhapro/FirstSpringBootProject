package com.example.webservicesproject.repositories;

import com.example.webservicesproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
