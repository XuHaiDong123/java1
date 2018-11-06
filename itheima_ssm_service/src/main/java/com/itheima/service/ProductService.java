package com.itheima.service;

import com.itheima.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void save(Product product);

    void deleteById(String vals);

    Product findProductById(String id);

    Product update(String id);
}
