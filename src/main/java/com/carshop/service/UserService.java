package com.carshop.service;

import com.carshop.domain.Num;
import com.carshop.domain.User;

import java.util.List;

public interface UserService {

    User login(String username, String password);

    List<User> selectuser(String username, String phone);

    Integer deleteUser(Integer id);

    User finduserbyId(Integer id);

    Integer update(User user);
    int userResgiter(User user);

    /**
     * 查看用户的积分
     */
    Integer selectNum(Integer user_id);

    /*
    * 注册时添加积分记录
    * */
    Integer insertZero(Integer user_id);
}
