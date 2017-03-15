package com.wuliu.service;

import com.wuliu.dao.enterprisedao;
import com.wuliu.serviceinterface.enterpriseinterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by 木木高 on 2017/3/9.
 */
@Service
public class enterpriseimpl implements enterpriseinterface {
    @Autowired
    private enterprisedao enterprisedao;
    public int deleteByPrimaryKey(Integer eid) {
        return 0;
    }

    public int insert(enterpriseinterface record) {
        return 0;
    }

    public int insertSelective(enterpriseinterface record) {
        return 0;
    }

    public enterpriseinterface selectByPrimaryKey(Integer eid) {
        return null;
    }

    public int updateByPrimaryKeySelective(enterpriseinterface record) {
        return 0;
    }

    public int updateByPrimaryKey(enterpriseinterface record) {
        return 0;
    }

    public List<HashMap> getentermessage(int page, int size) {
        return enterprisedao.getentermessage(page, size);
    }

    public int getnum() {
        return enterprisedao.getnum();
    }
}
