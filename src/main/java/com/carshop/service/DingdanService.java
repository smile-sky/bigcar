package com.carshop.service;

import com.carshop.domain.Dingdan;
import com.carshop.domain.Num;

import java.util.List;

public interface DingdanService {

    /**
     * 查询所有订单
     *
     * @return
     */
    List<Dingdan> queryDingdan(Integer product_id, Integer user_id);

    List<Dingdan> queryDingdan1(Integer sellerid);

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

    List<Dingdan> selectuseridandstatu(Integer user_id, Integer statu);

    /*添加积分表*/
    Num insertNum(Integer user_id, Integer number);
}
