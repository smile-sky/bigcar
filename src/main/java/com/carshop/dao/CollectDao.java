package com.carshop.dao;

import com.carshop.domain.Collect;
import org.apache.ibatis.annotations.Param;

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
     * @param user_id
     * @return
     */
    List<Collect> getCollect(Integer user_id);


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

    Integer selectCollectUandP(@Param("user_id") Integer user_id, @Param("product_id") Integer product_id);

}
