package cn.how2j.springCloud.api.product.service;

import cn.how2j.springCloud.api.client.ProductClientRibbon;

import cn.how2j.springCloud.api.product.bo.ProductBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductClientRibbon productClientRibbon;

    public List<ProductBO> listProducts(){
        List<ProductBO> ps = productClientRibbon.listProdcuts();
        return ps;
    }
}
