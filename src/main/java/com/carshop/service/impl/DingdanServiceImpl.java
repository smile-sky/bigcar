package com.carshop.service.impl;


import com.carshop.dao.DingdanDao;
import com.carshop.domain.Dingdan;
import com.carshop.service.DingdanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("dingdanService")
public class DingdanServiceImpl  implements DingdanService {

    public final DingdanDao dingdanDao;
    @Autowired
    public DingdanServiceImpl(DingdanDao dingdanDao){
        this.dingdanDao=dingdanDao;
    }

    /**
     * 查看订单
     * @return
     */
    @Override
    public List<Dingdan> queryDingdan() {
        return dingdanDao.queryDingdan();
    }

    /**
     * 根据ID查看订单
     * @param dingdanId
     * @return
     */
    @Override
    public Dingdan getDingdan(int dingdanId) {
        return dingdanDao.getDingdan(dingdanId);
    }

    /**
     * 添加订单
     * @param dingdan
     * @return
     */
    @Override
    public int insertDingdan(Dingdan dingdan) {
        return dingdanDao.insertDingdan(dingdan);
    }

    /**
     * 根据ID删除订单
     * @param dingdanId
     * @return
     */
    @Override
    public int deleteDingdan(int dingdanId) {
        return dingdanDao.deleteDingdan(dingdanId);
    }

    /**
     * 更新订单信息
     * @param dingdan
     * @return
     */
    @Override
    public int updateDingdan(Dingdan dingdan) {
        return dingdanDao.updateDingdan(dingdan);
    }
}
