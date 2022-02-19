package com.example.commerce.interfaces.product;

import com.example.commerce.application.product.ProductFacade;
import com.example.commerce.domain.product.ProductCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
public class ProductApiController {
    private final ProductFacade productFacade;

    @PostMapping("/api/v1/products")
    public ResponseEntity<ProductResponse> registerProduct(@RequestBody @Valid ProductRegisterRequest request) {
        var command = ProductCommand.of(request);
        var info = productFacade.registerProduct(command);
        var response = ProductResponse.of(info);
        return ResponseEntity.ok(response);
    }

}
