package com.wuliu.dao;

import com.wuliu.pojo.Customar;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;

@Repository
public interface Customardao {
    int deleteByPrimaryKey(Integer cid);

    int insert (String name, String password,
               String email,int sex,
             String phone,  String question,
               String result,Date time);
    int getUsername(String username);
    int getUsermessage(String username, String password);
    int insertSelective(Customar customar);

    Customardao selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Customardao record);

    int updateByPrimaryKey(Customardao record);
    int updatepassword( String Password ,int cid);
    Integer getcid(String mail);
    Integer changepassword(String Cname, String Question ,String Ruselt);
    Integer getcidbypassword(String Cname, String Question ,String Ruselt);
    int getpower(String name);

}