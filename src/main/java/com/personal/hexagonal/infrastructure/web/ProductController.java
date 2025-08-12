package com.personal.hexagonal.infrastructure.web;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.hexagonal.domain.model.Product;
import com.personal.hexagonal.domain.port.in.Product.CreateProductUseCase;

@RestController
@RequestMapping("/api/products")
@Validated
public class ProductController {
    
    private final CreateProductUseCase createProductUseCase;

    public ProductController(CreateProductUseCase createProductUseCase) {
        this.createProductUseCase = createProductUseCase;
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        Product domainProduct = new Product(null, product.getName(), product.getDescription(), product.getPrice(), product.getStock(), product.getCategory());
        return createProductUseCase.createProduct(domainProduct);   
    }


}
