package com.carshop.service.impl;

import com.carshop.dao.TellDao;
import com.carshop.domain.Tell;
import com.carshop.service.TellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("tell")
public class TellServiceImpl implements TellService {
    @Autowired
    private TellDao tellDao;

    //买家查自己所有评论


    @Override
    public List<Tell> querytell(Integer user_id, Integer product_id) {
        return tellDao.querytell(user_id, product_id);
    }

    //买家增加评论
    @Override
    public Integer inserttell(Tell tell) {
        return tellDao.inserttell(tell);
    }

    //买家删除自己的评论
    @Override
    public Integer deletetell(Integer tell_id) {
        return tellDao.deletetell(tell_id);
    }

    @Override
    public List<Tell> selectcar(Integer product_id) {
        return tellDao.selectcar(product_id);
    }
}
