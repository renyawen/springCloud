package cn.how2j.springCloud.api.product.controller;


import cn.how2j.springCloud.api.product.bo.ProductBO;
import cn.how2j.springCloud.api.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public Object products(Model m){
        List<ProductBO> ps = productService.listProducts();
        m.addAttribute("ps",ps);
        return ps;
    }
}
