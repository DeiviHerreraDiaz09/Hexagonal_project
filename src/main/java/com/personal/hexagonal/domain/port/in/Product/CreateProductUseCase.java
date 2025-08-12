package com.personal.hexagonal.domain.port.in.Product;

import com.personal.hexagonal.domain.model.Product;

public interface CreateProductUseCase {

    Product createProduct(Product product);
    
}
