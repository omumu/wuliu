package com.wuliu.service;

import  com.wuliu.dao.*;
import com.wuliu.serviceinterface.customarinterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by 木木高 on 2017/3/8.
 */
@Service
public class custormimpl implements customarinterface {
    @Autowired
    private Customardao customardao;


    public int deleteByPrimaryKey(Integer cid) {
        return 0;
    }

    public void insert(String name, String password, String email, int sex, String phone, String question, String result,Date time) {
        customardao.insert(name,password,email,sex,phone,question,result,time);
    }

    public int getUsername(String username) {
        int result=customardao.getUsername(username);
        if(result!=0){return 1;}else{return 0;}
    }


    public int insertSelective(customarinterface record) {
        return 0;
    }

    public int getUsermessage(String username, String password) {
      if(customardao.getUsermessage(username, password)!=0){return 1;}else{return 0;}
    }

    public customarinterface selectByPrimaryKey(Integer cid) {
        return null;
    }

    public int updateByPrimaryKeySelective(customarinterface record) {
        return 0;
    }

    public int updateByPrimaryKey(customarinterface record) {
        return 0;
    }

    public int updatepassword(String Password, int cid) {
        return customardao.updatepassword(Password, cid);
    }

    public Integer getcid(String mail) {
        return customardao.getcid(mail);
    }

    public Integer changepassword(String Cname, String Question, String Ruselt) {
        return customardao.changepassword(Cname, Question, Ruselt);
    }

    public Integer getcidbypassword(String Cname, String Question, String Ruselt) {
        return customardao.getcidbypassword(Cname, Question, Ruselt);
    }

    public int getpower(String name) {
        return customardao.getpower(name);
    }
}
