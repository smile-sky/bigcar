package com.carshop.service;

import com.carshop.domain.User;

import java.util.List;

public interface UserService {

    User login(String username, String password);

    List<User> selectuser(String username, String phone);

    Integer deleteUser(Integer id);


}
