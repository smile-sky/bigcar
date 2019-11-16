package com.carshop.domain;

public class Seller {
    private Integer sellerid;
    private String username;
    private String password;
    private String phone;
    private String address;

    public Seller(){}

    public Seller(Integer sellerid, String username, String password, String phone, String address) {
        this.sellerid = sellerid;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }

    public Integer getSellerid() {
        return sellerid;
    }

    public void setSellerid(Integer sellerid) {
        this.sellerid = sellerid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "sellerid=" + sellerid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
