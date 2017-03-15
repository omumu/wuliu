package com.wuliu.dao;

import com.wuliu.pojo.placard;

import java.util.HashMap;
import java.util.List;

public interface placarddao {
    int deleteByPrimaryKey(Integer pid);

    int insert(placarddao record);

    int insertSelective(placarddao record);

    placarddao selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(placarddao record);

    int updateByPrimaryKeyWithBLOBs(placarddao record);

    int updateByPrimaryKey(placarddao record);
    int addpalace(placard placard);
    List<HashMap> getplacedmessage(int page,int size);
    int getnum();
    int deleteplace(int id);
    int updateplared(String Title ,String Content ,int Pid);
    List<HashMap> getmessagebypid(int pid);
}