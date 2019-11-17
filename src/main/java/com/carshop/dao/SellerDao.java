package com.carshop.dao;

import com.carshop.domain.Seller;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SellerDao {
    /**
     *  查询所有
     * @param
     * @return
     */
    List<Seller> queryseller();

    /**
     *
     * @param
     * @return
     */
//    按条件（用户名）查询
    Seller selectseller(@Param("sellerid") Integer sellerid);

    //卖家登录
    Seller login(@Param("username") String username,@Param("password") String password);

    //增加卖家用户信息
    int insertseller(Seller seller);

    //删除卖家用户信息
    int deleteseller(int sellerid);

    //修改卖家用户信息
    int updateseller(Seller seller);



}
