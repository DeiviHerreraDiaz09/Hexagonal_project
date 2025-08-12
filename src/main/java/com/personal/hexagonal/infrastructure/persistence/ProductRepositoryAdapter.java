package com.personal.hexagonal.infrastructure.persistence;

import org.springframework.stereotype.Component;

import com.personal.hexagonal.domain.model.Product;
import com.personal.hexagonal.domain.port.out.Product.ProductRepository;

@Component
public class ProductRepositoryAdapter implements ProductRepository {

    private final ProductRepositoryJpa repositoryJpa;

    public ProductRepositoryAdapter(ProductRepositoryJpa repositoryJpa) {
        this.repositoryJpa = repositoryJpa;
    }

    @Override
    public Product save(Product product) {
        ProductEntity entity = ProductEntity.fromDomain(product);
        ProductEntity savedEntity = repositoryJpa.save(entity);
        return savedEntity.toDomain();
    }

}
