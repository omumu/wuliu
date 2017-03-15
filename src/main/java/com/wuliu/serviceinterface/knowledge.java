package com.wuliu.serviceinterface;

public interface knowledge {
    int deleteByPrimaryKey(Integer kid);

    int insert(knowledge record);

    int insertSelective(knowledge record);

    knowledge selectByPrimaryKey(Integer kid);

    int updateByPrimaryKeySelective(knowledge record);

    int updateByPrimaryKeyWithBLOBs(knowledge record);

    int updateByPrimaryKey(knowledge record);
}