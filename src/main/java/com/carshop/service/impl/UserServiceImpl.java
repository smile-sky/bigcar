package com.carshop.service.impl;

import com.carshop.dao.UserDao;
import com.carshop.domain.User;
import com.carshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<User> selectuser(String username, String phone) {
        return ud.findUser(username, phone);
    }

    @Override
    public Integer deleteUser(Integer id) {
        return ud.deleteUserbyId(id);
    }

    @Override
    public User finduserbyId(Integer id) {
        return ud.selectbyId(id);
    }

    @Override
    public Integer update(User user) {
        return ud.updateUser(user);
    }


}
