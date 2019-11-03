package cn.how2j.springCloud.api.product.controller;

import cn.how2j.springCloud.api.product.bo.ProductBO;

import cn.how2j.springCloud.api.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Slf4j
@Controller
@RefreshScope
public class ProductController {

    @Autowired
    private ProductService productService;

    @Value("${version}")
    String version;

    @RequestMapping("/products")
    public Object products(Model m){
        List<ProductBO> ps = productService.listProducts();
        m.addAttribute("ps",ps);
        m.addAttribute("version",version);
        return "products";
    }
}
