package com.carshop.service;

import com.carshop.domain.Seller;

import java.util.List;

public interface SellerService {
    /**
     *  遍历查询所有
     * @param
     * @return
     */
    List<Seller> queryseller(String username,String phone);

    /**
     *  按条件（用户名）查询
     * @param
     * @return
     */
    Seller selectseller(Integer sellerid);
    //卖家登录
    Seller login(String username,String password);

    //增加卖家用户信息
    int insertseller(Seller seller);

    //修改卖家用户信息
    int updateseller(Seller seller);

    //删除卖家用户信息
    int deleteseller(int sellerid);

    //查询上架货品信息

    //上架二手车

    //下架二手车
}
