package com.carshop.service;

import com.carshop.domain.Product;

import java.util.List;

public interface ProductService {

    //（买家）商品按商品品牌跟型号查询
    Product queryproduct(String pinpai, String type);

    //（卖家查询）商家查所有
    List<Product> selectproduct();

    //卖家根据商品ID查询
    Product selectproductid(Integer productid);


    //商品上架
    int insertproduct(Product product);

    //商品删除
    int deleteproduct(int productid);
    //商品修改
    int updateproduct(Product product);
}
