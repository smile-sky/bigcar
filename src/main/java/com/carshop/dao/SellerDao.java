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
    Seller selectseller(@Param("username") String username);

    //增加卖家用户信息
  int insertseller(Seller seller);

    //删除卖家用户信息
int deleteseller(int sellerid);

    //修改卖家用户信息
 int updateseller(Seller seller);

    //查询上架货品信息

    //上架二手车

    //下架二手车


}
