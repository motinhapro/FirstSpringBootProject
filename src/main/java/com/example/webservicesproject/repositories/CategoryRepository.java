package com.example.webservicesproject.repositories;

import com.example.webservicesproject.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
