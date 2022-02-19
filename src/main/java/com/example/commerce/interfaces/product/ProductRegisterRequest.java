package com.example.commerce.interfaces.product;

import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
public class ProductRegisterRequest {
    @NotEmpty
    private String productName;

    @NotEmpty
    private String description;

    @NotNull
    private Long price;
}
