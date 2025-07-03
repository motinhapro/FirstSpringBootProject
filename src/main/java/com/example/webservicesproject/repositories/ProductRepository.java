package com.example.webservicesproject.repositories;

import com.example.webservicesproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
