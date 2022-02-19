package com.example.commerce.application.product;

import com.example.commerce.domain.product.ProductCommand;
import com.example.commerce.domain.product.ProductInfo;
import com.example.commerce.domain.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductFacade {

    private final ProductService productService;

    public ProductInfo registerProduct(ProductCommand command) {
        return productService.registerProduct(command);
    }
}
