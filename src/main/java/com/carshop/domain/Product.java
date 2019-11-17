package com.carshop.domain;

public class Product {
    private Integer product_id;
    private String type;
    private Integer price;
    private Integer seller_id;
    private String beizhu;
    private String pinpai;
    private String color;
    private String check_list;

    public Product(){}

    public Product(Integer product_id, String type, Integer price, Integer seller_id, String beizhu, String pinpai, String color, String check_list) {
        this.product_id = product_id;
        this.type = type;
        this.price = price;
        this.seller_id = seller_id;
        this.beizhu = beizhu;
        this.pinpai = pinpai;
        this.color = color;
        this.check_list = check_list;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
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

    public Integer getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(Integer seller_id) {
        this.seller_id = seller_id;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    public String getPinpai() {
        return pinpai;
    }

    public void setPinpai(String pinpai) {
        this.pinpai = pinpai;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCheck_list() {
        return check_list;
    }

    public void setCheck_list(String check_list) {
        this.check_list = check_list;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", seller_id=" + seller_id +
                ", beizhu='" + beizhu + '\'' +
                ", pinpai='" + pinpai + '\'' +
                ", color='" + color + '\'' +
                ", check_list='" + check_list + '\'' +
                '}';
    }
}
