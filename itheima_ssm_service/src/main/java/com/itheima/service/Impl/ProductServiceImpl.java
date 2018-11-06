package com.itheima.service.Impl;

import com.itheima.domain.Product;
import com.itheima.dao.ProductDao;
import com.itheima.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    public void deleteById(String vals) {
        String[] split = vals.split(",");
        for (String s : split) {
            productDao.deleteById(s);
        }
    }

    @Override
    public Product findProductById(String id) {
        Product product = productDao.findProductById(id);
        return product;
    }

    @Override
    public Product update(String id) {
        return productDao.update(id);
    }
}
