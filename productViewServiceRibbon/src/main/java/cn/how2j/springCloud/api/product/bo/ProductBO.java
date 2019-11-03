package cn.how2j.springCloud.api.product.bo;

import lombok.Data;

@Data
public class ProductBO {
    private int id;
    private String name;
    private int price;

    public ProductBO(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
