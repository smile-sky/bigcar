package com.carshop.dao;

import com.carshop.domain.Num;
import com.carshop.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    //@Select("select * from `user` where username = #{arg0} and passwd = #{arg1};")
    User findUserByUnAndPs(@Param("no") String username, @Param("pw") String password);

    List<User> findUser(@Param("username") String username, @Param("phone") String phone);

    //根据ID删除
    Integer deleteUserbyId(Integer id);

    User selectbyId(Integer id);

    Integer updateUser(User user);
    /**
     *用户注册
     * @param user
     * @return
     */
    int userResgiter(User user);

    /**
     * 用户查看积分表
     */
    Integer selectNum1(@Param("user_id") Integer user_id);

    /**
     * 注册用户的时候自动添加一条积分为0的积分表记录
     */

    Integer insertZero(Integer user_id);


}
