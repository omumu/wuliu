package com.wuliu.serviceinterface;

import java.util.HashMap;
import java.util.List;

public interface placardinterface {
    int deleteByPrimaryKey(Integer pid);

    int insert(placardinterface record);

    int insertSelective(placardinterface record);

    placardinterface selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(placardinterface record);

    int updateByPrimaryKeyWithBLOBs(placardinterface record);

    int updateByPrimaryKey(placardinterface record);
    int addpalace(com.wuliu.pojo.placard placard);
    List<HashMap> getplacedmessage(int page, int size);
    int getnum();
    int deleteplace(int id);
    int updateplared(String Title ,String Content ,int Pid);
    List<HashMap> getmessagebypid(int pid);
}