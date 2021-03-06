package com.itheima.dao;

import com.itheima.domain.Product;

import java.util.List;

public interface ProductDao {
    List<Product> findAll();

    void save(Product product);

    void deleteById(String s);

    Product findProductById(String id);

    Product update(String id);
}
