package com.wuliu.pojo;

import java.util.Date;

public class Customar {
    private Integer cid;

    private String cname;

    private String password;

    private Integer power;

    private String email;

    private Integer sex;

    private String phone;

    private String question;

    private String ruselt;

    private Date cissuedate;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getRuselt() {
        return ruselt;
    }

    public void setRuselt(String ruselt) {
        this.ruselt = ruselt == null ? null : ruselt.trim();
    }

    public Date getCissuedate() {
        return cissuedate;
    }

    public void setCissuedate(Date cissuedate) {
        this.cissuedate = cissuedate;
    }
}