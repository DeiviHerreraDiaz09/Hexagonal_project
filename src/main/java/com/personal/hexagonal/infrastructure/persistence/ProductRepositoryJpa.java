package com.personal.hexagonal.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositoryJpa extends JpaRepository<ProductEntity, Long> {
}
