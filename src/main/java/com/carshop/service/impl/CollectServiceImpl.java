package com.carshop.service.impl;



import com.carshop.dao.CollectDao;
import com.carshop.domain.Collect;

import com.carshop.service.CollectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("collectService")
public class CollectServiceImpl implements CollectService {

    public final CollectDao collectDao;
    @Autowired
    public CollectServiceImpl(CollectDao collectDao){
        this.collectDao=collectDao;
    }
    @Override
    public List<Collect> queryCollect() {//查询所有收藏表信息
        return collectDao.queryCollect();
    }

    @Override
    public List<Collect> getCollect(Integer user_id) {//根据ID查询收藏表信息
        return collectDao.getCollect(user_id);
    }

    @Override
    public int insertCollect(Collect collect) {//添加收藏表信息
        return collectDao.insertCollect(collect);
    }

    @Override
    public int deleteCollect(int collectId) {//根据ID删除收藏表信息
        return collectDao.deleteCollect(collectId);
    }

    @Override
    public int updateCollect(Collect collect) {//更新收藏表信息
        return collectDao.updateCollect(collect);
    }
}
