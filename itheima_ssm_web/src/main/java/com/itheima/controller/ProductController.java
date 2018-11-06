package com.itheima.controller;

import com.itheima.domain.Product;
import com.itheima.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    public ProductService productService;

    @RequestMapping("/findAll")//商品查询
    public String findAll(Model model){
        List<Product> list = productService.findAll();
        model.addAttribute("productList",list);
        return "product-list";
    }
    @RequestMapping("/save")//商品添加
    public String save(Product product){
        productService.save(product);
        return "redirect:/product/findAll";
    }
    @RequestMapping("/deleteById")//商品删除
    public String deleteById( String vals){
        productService.deleteById(vals);
        return "redirect:/product/findAll";
    }
    @RequestMapping("/update")//商品修改
    public String update(String id,Model model){
        Product product=productService.findProductById(id);
        model.addAttribute("product",product);
        return "redirect:/product/findAll";
    }
}
