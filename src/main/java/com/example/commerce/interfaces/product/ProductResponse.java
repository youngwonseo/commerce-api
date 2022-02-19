package com.example.commerce.interfaces.product;

import com.example.commerce.domain.product.ProductCommand;
import com.example.commerce.domain.product.ProductInfo;
import lombok.Getter;

@Getter
public class ProductResponse {
    private String productToken;
    private String productName;
    private String description;
    private Long price;

    public static ProductResponse of(ProductInfo info) {
        ProductResponse response = new ProductResponse();
        response.productToken = info.getProductToken();
        response.productName = info.getProductName();
        response.description = info.getDescription();
        response.price = info.getPrice();
        return response;
    }
}
