package cn.how2j.springCloud.api.product.service;


import java.util.List;

import cn.how2j.springCloud.api.feignClient.ProductClientFeign;
import cn.how2j.springCloud.api.product.bo.ProductBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
    @Autowired
    ProductClientFeign productClientFeign;

    public List<ProductBO> listProducts(){
        return productClientFeign.listProducts();
    }
}