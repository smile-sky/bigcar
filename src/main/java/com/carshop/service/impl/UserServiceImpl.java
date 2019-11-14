package com.carshop.service.impl;

import com.carshop.dao.UserDao;
import com.carshop.domain.User;
import com.carshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    public final UserDao ud;

    @Autowired
    public UserServiceImpl(UserDao ud) {
        this.ud = ud;
    }


    @Override
    public User login(String username, String password) {
        return ud.findUserByUnAndPs(username, password);
    }


}
