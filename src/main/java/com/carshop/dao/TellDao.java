package com.carshop.dao;

import com.carshop.domain.Tell;

import java.util.List;

public interface TellDao {
    //买家查自己所有评论
    List<Tell> querytell(Integer user_id);

    //买家增加评论
    Integer inserttell(Tell tell);

    //买家删除自己的评论
    Integer deletetell(Integer tell_id);
}
