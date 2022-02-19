package com.example.commerce.domain.product;

import lombok.Getter;

@Getter
public class ProductInfo {
    private Long id;
    private String productToken;
    private String productName;
    private String description;
    private Long price;

    public static ProductInfo of(Product product) {
        ProductInfo info = new ProductInfo();
        info.id = product.getId();
        info.productToken = product.getProductToken();
        info.productName = product.getProductName();
        info.description = product.getDescription();
        info.price = product.getPrice();
        return info;
    }
}
