package com.wuliu.serviceinterface;

public interface logistics {
    int deleteByPrimaryKey(Integer lid);

    int insert(logistics record);

    int insertSelective(logistics record);

    logistics selectByPrimaryKey(Integer lid);

    int updateByPrimaryKeySelective(logistics record);

    int updateByPrimaryKeyWithBLOBs(logistics record);

    int updateByPrimaryKey(logistics record);
}