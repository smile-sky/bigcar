package com.carshop.controller;

import com.carshop.domain.User;
import com.carshop.service.AdminService;
import com.carshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 快递员控制器
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService us;
//    private UserService userService;

    @Autowired
    public UserController(UserService us) {
        this.us = us;
    }

    //用户登录的方法
    @RequestMapping("/loginHandle")
    public String userLogin(String username, String password) {
        String a;
        User user = us.login(username, password);
        if (user == null) {
            a = "error";
        } else {
            // 用户名和密码正确，登录成功
            a = "success";
            // 将用户添加到 session 中
//            session.getSession().setAttribute("user", user);
        }
        return a;
    }

    @RequestMapping("/select")
    public String selectuser(String username, String phone, Model d) {
        String a;
        List<User> users = us.selectuser(username, phone);
        if (users != null) {
            d.addAttribute("us", users);
            a = "user/userM";
        } else {
            a = "error";
        }
        return a;
    }

    @RequestMapping("delete")
    public String deleteUser(Integer id) {
        String a;
        Integer b = us.deleteUser(id);
        if (b != null) {
            a = "success";
        } else a = "error";
        return a;
    }

    @RequestMapping("/selectbyId")
    public String selectbyId(Integer id, Model d) {
        String a;
        User user = us.finduserbyId(id);
        d.addAttribute("user", user);
        if (user != null) {
            a = "reviseUser";
        } else a = "error";

        return a;
    }

    @RequestMapping("update")
    public String updateuser(User user) {
        String a;
        Integer b = us.update(user);
        if (b != null) {
            a = "redirect:/user/select";
        } else a = "error";
        return a;
    }
    @RequestMapping("/userRegister")//用户注册
    public String userRegister(User user) {
        int user2=us.userResgiter(user);
        String a;
        if (user != null) {
            a = "success";
        } else a = "error";
        return a;
    }

}
