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
        var productInfo = productService.registerProduct(command);
        // 트렌젝션과 관계없이 동작할 로직 추가
        // 예) 유저에게 알람

        return productInfo;
    }

    public ProductInfo getProduct(String token) {
        return productService.getProductInfo(token);
    }

}
