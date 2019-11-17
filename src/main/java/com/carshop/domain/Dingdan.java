package com.carshop.domain;

import java.util.Date;

/**
 * 订单实体类
 */
public class Dingdan {

    private Integer dingdan_id;//订单ID
    private Integer user_id;//用户ID
    private Integer product_id;//商品ID
    private Date order_time;//下单时间
    private Integer statu;//状态

    /**
     * 无参的构造方法
     */
    public Dingdan() {
    }

    /**
     * 有参的构造方法
     */
    public Dingdan(Integer dingdan_id, Integer user_id, Integer product_id, Date order_time, Integer statu) {
        this.dingdan_id = dingdan_id;
        this.user_id = user_id;
        this.product_id = product_id;
        this.order_time = order_time;
        this.statu = statu;
    }


    public Integer getDingdan_id() {
        return dingdan_id;
    }

    public void setDingdan_id(Integer dingdan_id) {
        this.dingdan_id = dingdan_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Date getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }


    @Override
    public String toString() {
        return "Dingdan{" +
                "dingdan_id=" + dingdan_id +
                ", user_id=" + user_id +
                ", product_id=" + product_id +
                ", order_time=" + order_time +
                ", statu='" + statu + '\'' +
                '}';
    }
}
