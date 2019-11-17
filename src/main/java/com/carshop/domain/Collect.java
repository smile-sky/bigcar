package com.carshop.domain;

/**
 * 收藏表实体类
 */
public class Collect {

    private Integer collect_id;//收藏ID
    private String type;//车子型号
    private Integer price;//价格
    private String pinpai;//品牌
    private Integer user_id;//用户ID
    private Integer product_id;//商品ID

    /**
     * 无参的构造方法
     */
    public Collect() {
    }

    /**
     * 有参的构造方法
     */
    public Collect(Integer collect_id, String type, Integer price, String pinpai, Integer user_id, Integer product_id) {
        this.collect_id = collect_id;
        this.type = type;
        this.price = price;
        this.pinpai = pinpai;
        this.user_id = user_id;
        this.product_id = product_id;
    }

    public Integer getCollect_id() {
        return collect_id;
    }

    public void setCollect_id(Integer collect_id) {
        this.collect_id = collect_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPinpai() {
        return pinpai;
    }

    public void setPinpai(String pinpai) {
        this.pinpai = pinpai;
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

    @Override
    public String toString() {
        return "Collect{" +
                "collect_id=" + collect_id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", pinpai='" + pinpai + '\'' +
                ", user_id=" + user_id +
                ", product_id=" + product_id +
                '}';
    }
}
