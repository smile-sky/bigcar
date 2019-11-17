package com.carshop.service;

import com.carshop.domain.Product;

import java.util.List;

public interface ProductService {

    //（买家）商品按商品品牌跟型号查询
    List<Product> queryproduct(String pinpai, String type);

    //（卖家查询）商家查所有
    Product selectproduct(Integer product_id);

    //卖家根据商品ID查询
    Product selectproductid(Integer product_id);


    //商品上架
    int insertproduct(Product product);

    //商品删除
    int deleteproduct(Integer product_id);
    //商品修改
    int updateproduct(Product product);

    //禁用启用
    Integer stopproduct(Integer product_id);

    Integer startproduct(Integer product_id);

}
