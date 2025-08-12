package com.personal.hexagonal.domain.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {
    
    private Long id;    
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
    private String category;
    
    // Constructor 
    public Product() {}
    
    // Constructor with parameters
    public Product(String name, String description, BigDecimal price, Integer stock, String category) {
        this();
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }
}
