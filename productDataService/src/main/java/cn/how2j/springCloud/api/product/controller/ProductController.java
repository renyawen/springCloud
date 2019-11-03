package cn.how2j.springCloud.api.product.controller;

import cn.how2j.springCloud.api.product.bo.ProductBO;
import cn.how2j.springCloud.api.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public List<ProductBO> products(){
        List<ProductBO> ps = productService.listProducts();
        return ps;
    }
}
