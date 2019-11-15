package com.carshop.service.impl;

import com.carshop.dao.AdminDao;
import com.carshop.domain.Admin;
import com.carshop.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin login(String username, String password) {
        return adminDao.findUnandPw(username, password);
    }
}
