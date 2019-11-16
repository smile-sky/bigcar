package com.carshop.controller;

import com.carshop.domain.User;
import com.carshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 快递员控制器
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService us;


    @Autowired
    public UserController(UserService us) {
        this.us = us;

    }


    @RequestMapping("/loginHandle")
    public String userLogin(String username, String password, HttpServletRequest request) {
        String a;
        User user = us.login(username, password);
        if (user == null) {
            a="error";
        } else {
            // 用户名和密码正确，登录成功
            a="success";
            // 将用户添加到 session 中
            request.getSession().setAttribute("user", user);
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


}
