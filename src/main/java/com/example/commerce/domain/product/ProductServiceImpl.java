package com.example.commerce.domain.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductReader productReader;
    private final ProductStore productStore;

    @Override
    @Transactional
    public ProductInfo registerProduct(ProductCommand command) {
        Product product = productStore.store(Product.of(command));
        return ProductInfo.of(product);
    }

    @Override
    @Transactional(readOnly = true)
    public ProductInfo getProductInfo(String productToken) {
        Product product = productReader.getProduct(productToken);
        return ProductInfo.of(product);
    }
}
