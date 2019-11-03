package cn.how2j.springCloud.api.product.bo;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>ProductBo</p>
 */
@Data
public class ProductBO implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    private int id;
    /**
     * 名称
     */
    private String name;
    /**
     * 价格
     */
    private int price;

    public ProductBO(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
