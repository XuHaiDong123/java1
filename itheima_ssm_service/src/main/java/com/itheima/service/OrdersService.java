package com.itheima.service;

import com.itheima.domain.Orders;
import com.itheima.domain.Product;

import java.util.List;

public interface OrdersService {
    List<Orders> findAll(int page,int size);
}
