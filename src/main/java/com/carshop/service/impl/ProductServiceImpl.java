package com.carshop.service.impl;

import com.carshop.dao.ProductDao;
import com.carshop.domain.Product;
import com.carshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productservice")
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    //买家按照品牌和型号查找
    @Override
    public Product queryproduct(String pinpai, String type) {
        return productDao.queryproduct(pinpai,type);
    }
   //卖家查找所有
    @Override
    public List<Product> selectproduct() {
        return productDao.selectproduct();
    }

    //卖家根据商品ID查询
    @Override
    public Product selectproductid(Integer product_id) {
        return productDao.selectproductid(product_id);
    }

    //商品上架
    @Override
    public int insertproduct(Product product) {
        return productDao.insertproduct(product);
    }
    //商品删除
    @Override
    public int deleteproduct(Integer product_id) {
        return productDao.deleteproduct(product_id);
    }
    //商品修改
    @Override
    public int updateproduct(Product product) {
        return productDao.updateproduct(product);
    }
}
