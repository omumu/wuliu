package com.wuliu.dao;

public interface knowledgedao {
    int deleteByPrimaryKey(Integer kid);

    int insert(knowledgedao record);

    int insertSelective(knowledgedao record);

    knowledgedao selectByPrimaryKey(Integer kid);

    int updateByPrimaryKeySelective(knowledgedao record);

    int updateByPrimaryKeyWithBLOBs(knowledgedao record);

    int updateByPrimaryKey(knowledgedao record);
}