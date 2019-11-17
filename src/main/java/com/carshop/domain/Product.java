package com.carshop.domain;

public class Product {
    private Integer productid;
    private String type;
    private Integer price;
    private Integer sellerid;
    private String pinpai;
    private String color;
    private String checklist;

    public Product(){}
    public Product(Integer productid, String type, Integer price, Integer sellerid, String pinpai, String color, String checklist) {
        this.productid = productid;
        this.type = type;
        this.price = price;
        this.sellerid = sellerid;
        this.pinpai = pinpai;
        this.color = color;
        this.checklist = checklist;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
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

    public Integer getSellerid() {
        return sellerid;
    }

    public void setSellerid(Integer sellerid) {
        this.sellerid = sellerid;
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

    public String getChecklist() {
        return checklist;
    }

    public void setChecklist(String checklist) {
        this.checklist = checklist;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productid=" + productid +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", sellerid=" + sellerid +
                ", pinpai='" + pinpai + '\'' +
                ", color='" + color + '\'' +
                ", checklist='" + checklist + '\'' +
                '}';
    }
}
