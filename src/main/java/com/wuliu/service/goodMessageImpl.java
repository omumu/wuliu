package com.wuliu.service;
import com.wuliu.dao.goodsmegdao;
import com.wuliu.pojo.goodsmeg;
import com.wuliu.serviceinterface.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by 木木高 on 2017/3/9.
 */
@Service
public class goodMessageImpl implements goodsmeginterface {
    @Autowired
    private goodsmegdao goodsmegdao;
    public int deleteByPrimaryKey(Integer gid) {
        return 0;
    }

    public int insert(goodsmeg record) {
        return goodsmegdao.insert(record);
    }

    public int insertSelective(goodsmeginterface record) {
        return 0;
    }

    public goodsmeginterface selectByPrimaryKey(Integer gid) {
        return null;
    }

    public int updateByPrimaryKeySelective(goodsmeginterface record) {
        return 0;
    }

    public int updateByPrimaryKey(goodsmeginterface record) {
        return 0;
    }

    public List<HashMap<String,Object>> getgoodmessage(int page, int size) {
        return goodsmegdao.getgoodmessage(page,size);
    }

    public int gettotalnumber() {
        return goodsmegdao.gettotalnumber();
    }

    public List<HashMap> getgoodinfo(int page, int size) {
        return goodsmegdao.getgoodinfo(page, size);
    }

    public List<HashMap> getallgoodmessage(int page, int size) {
        return goodsmegdao.getallgoodmessage(page, size);
    }

    public int updateByPrimaryKey(goodsmeg goodsmeg) {
        return goodsmegdao.updateByPrimaryKey(goodsmeg);
    }

	public HashMap<String, Object> getdetail(int id) {
		// TODO Auto-generated method stub
		return goodsmegdao.getdetail(id);
	}
}
