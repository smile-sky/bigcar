package com.carshop.dao;

import com.carshop.domain.Dingdan;
import com.carshop.domain.Num;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单Dao接口
 */
public interface DingdanDao {


    /**
     * 查询所有订单
     *
     * @return
     */
    List<Dingdan> queryDingdan(@Param("product_id") Integer product_id, @Param("user_id") Integer user_id);

    /**
     * 根据订单ID加载订单信息
     * @param dingdanId
     * @return
     */
    Dingdan getDingdan(int dingdanId);
    /**
     * 添加订单
     *
     * @param dingdan
     * @return
     */
    Integer insertDingdan(Dingdan dingdan);

    /**
     * 根据订单ID删除订单记录
     *
     * @param dingdanId
     * @return
     */
    int deleteDingdan(int dingdanId);

    /**修改订单
     * @param dingdan_id
     * @return
     */
    Integer updateDingdan(Integer dingdan_id);

    List<Dingdan> selectuseridandstatu(@Param("user_id") Integer user_id, @Param("statu") Integer statu);

    /*添加积分表*/
    Num insertNum(Integer user_id, Integer number);

}
