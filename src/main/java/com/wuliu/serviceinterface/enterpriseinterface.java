package com.wuliu.serviceinterface;

import java.util.HashMap;
import java.util.List;

public interface enterpriseinterface {
    int deleteByPrimaryKey(Integer eid);

    int insert(enterpriseinterface record);

    int insertSelective(enterpriseinterface record);

    enterpriseinterface selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(enterpriseinterface record);

    int updateByPrimaryKey(enterpriseinterface record);
    List<HashMap> getentermessage(int page, int size);
    int getnum();
}