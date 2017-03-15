package com.wuliu.serviceinterface;

import java.util.HashMap;
import java.util.List;

public interface carmessageinterface {
    List<HashMap<String,Object>> getcarmessage(int page, int size);
    int deleteByPrimaryKey(Integer code);

    int insert(carmessageinterface record);

    int insertSelective(carmessageinterface record);

    carmessageinterface selectByPrimaryKey(Integer code);

    int updateByPrimaryKeySelective(carmessageinterface record);

    int updateByPrimaryKey(carmessageinterface record);
    int getnumber();
}