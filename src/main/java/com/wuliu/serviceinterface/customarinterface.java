package com.wuliu.serviceinterface;

import java.util.Date;
import java.util.HashMap;
import java.util.List;


public interface customarinterface {
    int deleteByPrimaryKey(Integer cid);

    void insert(String name, String password,
                String email,int sex,
                String phone,  String question,
                String result,Date time);
    //int getUsername(String username);
    int insertSelective(customarinterface record);
   // int getUsermessage(String username,String password);
  int getUsername(String username);
    int getUsermessage(String username, String password);
    customarinterface selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(customarinterface record);

    int updateByPrimaryKey(customarinterface record);
    int updatepassword( String Password ,int cid);
    Integer getcid(String mail);
    Integer changepassword(String Cname, String Question ,String Ruselt);
    Integer getcidbypassword(String Cname, String Question ,String Ruselt);
    int getpower(String name);

}