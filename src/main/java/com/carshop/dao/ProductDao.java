package com.carshop.dao;

import com.carshop.domain.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {
    //（买家）商品按商品品牌跟型号查询
    List<Product> queryproduct(@Param("pinpai") String pinpai, @Param("type") String type);

    List<Product> queryproduct5(@Param("pinpai") String pinpai, @Param("type") String type, @Param("product_id") Integer product_id);

    //（卖家查询）商品按商家ID查询
    Product selectproduct(Integer product_id);

    //卖家根据商品ID查询
    Product selectproductid(int productid);

    //商品上架（增加）
    int insertproduct(Product product);

    //商品删除
   int deleteproduct(int productid);
    //商品修改
    int updateproduct(Product product);

    //启用
    Integer startproduct(Integer product_id);

    //禁用
    Integer stopproduct(Integer product_id);

    List<Product> selectall();
}
