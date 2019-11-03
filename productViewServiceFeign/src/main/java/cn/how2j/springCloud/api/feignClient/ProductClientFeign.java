package cn.how2j.springCloud.api.feignClient;


import cn.how2j.springCloud.api.product.bo.ProductBO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author Administrator
 */
@FeignClient(value = "PRODUCT-DATA-SERVICE")
public interface ProductClientFeign {
    @GetMapping("/products")
    public List<ProductBO> listProducts();
}
