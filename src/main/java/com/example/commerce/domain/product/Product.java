package com.example.commerce.domain.product;

import com.example.commerce.domain.AbstractEntity;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Entity
public class Product extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productToken;
    private String productName;
    private String description;
    private Long price;

    public static Product of(ProductCommand command) {
        Product product = new Product();
        product.productToken = "abcd";
        product.productName = command.getProductName();
        product.description = command.getDescription();
        product.price = command.getPrice();
        return product;
    }
}
