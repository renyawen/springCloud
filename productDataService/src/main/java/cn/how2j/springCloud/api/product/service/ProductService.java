package cn.how2j.springCloud.api.product.service;



import cn.how2j.springCloud.api.product.bo.ProductBO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Value("${server.port}")
    String port;

    public List<ProductBO> listProducts(){
        List<ProductBO> ps = new ArrayList<>();
        ps.add(new ProductBO(1,"product a from port:"+port, 50));
        ps.add(new ProductBO(2,"product b from port:"+port, 150));
        ps.add(new ProductBO(3,"product c from port:"+port, 250));
        return ps;
    }
}
