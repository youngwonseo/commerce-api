package com.example.commerce.infrastructure.product;

import com.example.commerce.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByProductToken(String productToken);
}
