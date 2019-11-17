package com.carshop.controller;


import com.carshop.domain.Admin;
import com.carshop.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    //管理员登录的方法
    @RequestMapping("/login")
    public String login(String username, String password) {
        Admin admin = adminService.login(username, password);
        String a;
        if (admin == null) {
            a = "error";
        } else {
            a = "success";
        }
        return a;
    }

}
