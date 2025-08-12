package com.personal.hexagonal.application.service.Product;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.personal.hexagonal.domain.model.Product;
import com.personal.hexagonal.domain.port.in.Product.CreateProductUseCase;
import com.personal.hexagonal.domain.port.out.Product.ProductRepository;

@Service
public class CreateProductService implements CreateProductUseCase {

    private final ProductRepository productRepository;

    public CreateProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    @Transactional
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

}
