package com.wuliu.service;

import com.wuliu.dao.placarddao;
import com.wuliu.pojo.placard;
import com.wuliu.serviceinterface.placardinterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by 木木高 on 2017/3/9.
 */
@Service
public class palaceimpl implements placardinterface {
    @Autowired
    private placarddao placarddao;
    public int deleteByPrimaryKey(Integer pid) {
        return 0;
    }

    public int insert(placardinterface record) {
        return 0;
    }

    public int insertSelective(placardinterface record) {
        return 0;
    }

    public placardinterface selectByPrimaryKey(Integer pid) {
        return null;
    }

    public int updateByPrimaryKeySelective(placardinterface record) {
        return 0;
    }

    public int updateByPrimaryKeyWithBLOBs(placardinterface record) {
        return 0;
    }

    public int updateByPrimaryKey(placardinterface record) {
        return 0;
    }

    public int addpalace(placard placard) {
        return placarddao.addpalace(placard);
    }

    public List<HashMap> getplacedmessage(int page, int size) {
        return placarddao.getplacedmessage(page, size);
    }

    public int getnum() {
        return placarddao.getnum();
    }

    public int deleteplace(int id) {
        return placarddao.deleteplace(id);
    }

    public int updateplared(String Title, String Content, int Pid) {
        return placarddao.updateplared(Title, Content, Pid);
    }

    public List<HashMap> getmessagebypid(int pid) {
        return placarddao.getmessagebypid(pid);
    }
}
