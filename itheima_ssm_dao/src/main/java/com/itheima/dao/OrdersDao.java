package com.itheima.dao;

import com.itheima.domain.Orders;

import java.util.List;

public interface OrdersDao {
    List<Orders> findAll();
}
