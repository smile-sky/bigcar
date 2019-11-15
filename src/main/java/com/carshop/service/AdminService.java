package com.carshop.service;

import com.carshop.domain.Admin;

public interface AdminService {
    Admin login(String username, String password);
}
