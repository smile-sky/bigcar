package com.carshop.service.impl;

import com.carshop.dao.SellerDao;
import com.carshop.dao.UserDao;
import com.carshop.domain.Seller;
import com.carshop.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("sellerSevice")
public class SellerSeviceImpl implements SellerService {


@Autowired
@Qualifier("sellerDao")
private SellerDao sellerDao;
    //卖家登录
    @Override
    public Seller login(String username,String password){ return sellerDao.login(username, password); }

   //查询所有
    @Override
    public List<Seller> queryseller() {
        return sellerDao.queryseller();
    }

    // 按条件（用户名）查询
    @Override
    public Seller selectseller(String username,String phone) {
        return sellerDao.selectseller(username,phone);
    }

    //卖家信息增加
    @Override
    public int insertseller(Seller seller) {
        return sellerDao.insertseller(seller);
    }

    //删除卖家用户信息
    @Override
    public int deleteseller(int sellerid) {
        return sellerDao.deleteseller(sellerid);
    }

    //修改卖家用户信息
    @Override
    public int updateseller(Seller seller) {
        return sellerDao.updateseller(seller);
    }
}
