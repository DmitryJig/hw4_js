package com.example.hw4_1.hw4_js.repositories;

import com.example.hw4_1.hw4_js.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
