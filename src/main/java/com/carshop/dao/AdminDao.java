package com.carshop.dao;

import com.carshop.domain.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminDao {
    Admin findUnandPw(@Param("username") String username, @Param("password") String password);

    //管理员，卖家，买家三者的登录

}


