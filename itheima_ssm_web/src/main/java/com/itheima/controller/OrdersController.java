package com.itheima.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Orders;
import com.itheima.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @RequestMapping("/findAll")
    public String findAll(@RequestParam(name = "page", required = true,defaultValue = "1") int page,
                          @RequestParam(name = "size", required = true,defaultValue = "4") int size,
                          Model model){
        List<Orders> ordersList = ordersService.findAll(page,size);
        PageInfo pageInfo=new PageInfo(ordersList);
        model.addAttribute("pageInfo",pageInfo);
        return "orders-list";
    }
}
