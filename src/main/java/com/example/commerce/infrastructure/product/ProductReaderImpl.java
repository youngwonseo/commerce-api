package com.example.commerce.infrastructure.product;

import com.example.commerce.domain.product.Product;
import com.example.commerce.domain.product.ProductReader;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ProductReaderImpl implements ProductReader {
    private final ProductRepository productRepository;

    @Override
    public Product getProduct(String productToken) {
        return productRepository.findByProductToken(productToken).orElseThrow();
    }
}
