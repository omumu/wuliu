package com.wuliu.dao;

public interface logisticsdao {
    int deleteByPrimaryKey(Integer lid);

    int insert(logisticsdao record);

    int insertSelective(logisticsdao record);

    logisticsdao selectByPrimaryKey(Integer lid);

    int updateByPrimaryKeySelective(logisticsdao record);

    int updateByPrimaryKeyWithBLOBs(logisticsdao record);

    int updateByPrimaryKey(logisticsdao record);
}