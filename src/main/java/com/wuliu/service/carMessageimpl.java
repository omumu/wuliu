package com.wuliu.service;

import com.wuliu.dao.carmessagedao;
import com.wuliu.serviceinterface.carmessageinterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by 木木高 on 2017/3/9.
 */
@Service
public class carMessageimpl implements carmessageinterface {
    @Autowired
    private carmessagedao carmessagedao;
    public List<HashMap<String,Object>> getcarmessage(int page, int size) {
        return carmessagedao.getcarmessage(page,size);
    }

    public int deleteByPrimaryKey(Integer code) {
        return 0;
    }

    public int insert(carmessageinterface record) {
        return 0;
    }

    public int insertSelective(carmessageinterface record) {
        return 0;
    }

    public carmessageinterface selectByPrimaryKey(Integer code) {
        return null;
    }

    public int updateByPrimaryKeySelective(carmessageinterface record) {
        return 0;
    }

    public int updateByPrimaryKey(carmessageinterface record) {
        return 0;
    }

    public int getnumber() {
        return carmessagedao.getnumber();
    }
}
