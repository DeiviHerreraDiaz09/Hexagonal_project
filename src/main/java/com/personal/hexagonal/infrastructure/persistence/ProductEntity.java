package com.personal.hexagonal.infrastructure.persistence;

import java.math.BigDecimal;

import com.personal.hexagonal.domain.model.Product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(length = 500)
    private String description;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(nullable = false)
    private Integer stock;

    @Column(length = 50)
    private String category;

    public ProductEntity() {
    }

    public ProductEntity(String name, String description, BigDecimal price, Integer stock, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    public ProductEntity(Long id, String name, String description, BigDecimal price, Integer stock, String category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    // Dominio → entidad JPA
    public static ProductEntity fromDomain(Product product) {
        // No se pasa el id, se deja que JPA lo genere automáticamente
        return new ProductEntity(
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getStock(),
                product.getCategory());
    }

    // Entidad JPA → Dominio  
    public Product toDomain() {
        return new Product(
                this.id,
                this.name,
                this.description,
                this.price,
                this.stock,
                this.category);
    }

}
