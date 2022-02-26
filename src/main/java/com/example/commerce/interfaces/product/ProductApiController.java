package com.example.commerce.interfaces.product;

import com.example.commerce.application.product.ProductFacade;
import com.example.commerce.domain.product.ProductCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
public class ProductApiController {
    private final ProductFacade productFacade;

    @PostMapping("/api/v1/products")
    public ResponseEntity<ProductResponse> registerProduct(@RequestBody @Valid ProductRegisterRequest request) {
        var command = ProductCommand.of(request);
        var info = productFacade.registerProduct(command);
        return ResponseEntity.ok(ProductResponse.of(info));
    }

    @GetMapping("/api/v1/products/{token}")
    public ResponseEntity<ProductResponse> getProduct(@PathVariable String token) {
        var info = productFacade.getProduct(token);
        return ResponseEntity.ok(ProductResponse.of(info));
    }

}
