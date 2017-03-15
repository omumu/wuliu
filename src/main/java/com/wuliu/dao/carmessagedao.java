package com.wuliu.dao;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface carmessagedao {
    int deleteByPrimaryKey(Integer code);

    int insert(carmessagedao record);

    int insertSelective(carmessagedao record);

    carmessagedao selectByPrimaryKey(Integer code);

    int updateByPrimaryKeySelective(carmessagedao record);

    int updateByPrimaryKey(carmessagedao record);
    List<HashMap<String,Object>> getcarmessage(int page,int size);
    int getnumber();
}