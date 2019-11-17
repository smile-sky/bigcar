package com.carshop.domain;

import java.util.Date;

public class Tell {
    private Integer tell_id;  //评论ID
    private Integer user_id;  //用户ID
    private Integer product_id; //商品ID
    private String tell;      //评论内容
    private Date tell_time;   //评论时间

    public Tell(){}

    public Tell(Integer tell_id, Integer user_id, Integer product_id, String tell, Date tell_time) {
        this.tell_id = tell_id;
        this.user_id = user_id;
        this.product_id = product_id;
        this.tell = tell;
        this.tell_time = tell_time;
    }

    public Integer getTell_id() {
        return tell_id;
    }

    public void setTell_id(Integer tell_id) {
        this.tell_id = tell_id;
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

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public Date getTell_time() {
        return tell_time;
    }

    public void setTell_time(Date tell_time) {
        this.tell_time = tell_time;
    }

    @Override
    public String toString() {
        return "Tell{" +
                "tell_id=" + tell_id +
                ", user_id=" + user_id +
                ", product_id=" + product_id +
                ", tell='" + tell + '\'' +
                ", tell_time=" + tell_time +
                '}';
    }
}
