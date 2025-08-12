package com.personal.hexagonal.domain.port.out.Product;


import com.personal.hexagonal.domain.model.Product;

public interface ProductRepository {

    Product save(Product product);

}
