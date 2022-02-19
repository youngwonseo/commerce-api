package com.example.commerce.domain.product;

import com.example.commerce.interfaces.product.ProductRegisterRequest;
import lombok.Getter;


@Getter
public class ProductCommand {
    private String productName;
    private String description;
    private Long price;

    public static ProductCommand of(ProductRegisterRequest request) {
        ProductCommand command = new ProductCommand();
        command.productName = request.getProductName();
        command.description = request.getDescription();
        command.price = request.getPrice();
        return command;
    }
}
