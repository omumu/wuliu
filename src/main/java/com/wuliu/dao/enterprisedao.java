package com.wuliu.dao;

import java.util.HashMap;
import java.util.List;

public interface enterprisedao {
    int deleteByPrimaryKey(Integer eid);

    int insert(enterprisedao record);

    int insertSelective(enterprisedao record);

    enterprisedao selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(enterprisedao record);

    int updateByPrimaryKey(enterprisedao record);
    List<HashMap> getentermessage(int page,int size);
    int getnum();
}