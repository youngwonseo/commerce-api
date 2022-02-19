package com.example.commerce.domain.product;


public interface ProductService {

    ProductInfo registerProduct(ProductCommand command);

    ProductInfo getProductInfo(String productToken);
}
