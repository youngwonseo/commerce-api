package com.example.commerce.infrastructure.product;

import com.example.commerce.domain.product.Product;
import com.example.commerce.domain.product.ProductStore;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ProductStoreImpl implements ProductStore {
    private final ProductRepository productRepository;

    @Override
    public Product store(Product product) {
        return productRepository.save(product);
    }
}
