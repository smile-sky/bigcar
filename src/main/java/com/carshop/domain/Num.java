package com.carshop.domain;

public class Num {
    private Integer user_id;
    private Integer number;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Num{" +
                "user_id=" + user_id +
                ", number=" + number +
                '}';
    }
}
