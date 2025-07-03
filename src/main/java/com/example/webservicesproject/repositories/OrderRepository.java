package com.example.webservicesproject.repositories;

import com.example.webservicesproject.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
