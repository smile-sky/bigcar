package com.carshop.dao;

import com.carshop.domain.Collect;

import java.util.List;

/**
 * 订单Dao接口
 */
public interface CollectDao {


    /**
     * 查询所有收藏表信息
     *
     * @return
     */
    List<Collect> queryCollect();


    /**
     * 根据收藏表ID加载收藏表信息
     * @param CollectId
     * @return
     */
    Collect getCollect(int CollectId);


    /**
     * 添加收藏表信息
     *
     * @param collect
     * @return
     */
    int insertCollect(Collect collect);


    /**
     * 根据收藏表信息ID删除收藏表信息记录
     *
     * @param collectId
     * @return
     */
    int deleteCollect(int collectId);


    /**
     * 修改收藏表信息
     * @param collect
     * @return
     */
    int updateCollect(Collect collect);

}
