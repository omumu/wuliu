package com.wuliu.pojo;

import java.util.Date;

public class goodsmeg {
    private Integer gid;

    private String goodsstyle;

    private String goodsname;

    private String goodsnumber;

    private String goodsunit;

    private String startprovince;

    private String starcity;

    private String endprovince;

    private String endcity;

    private String style;

    private String transporttime;

    private String phone;

    private String link;

    private Date gissuedate;

    private String remark;

    private String request;

    private String username;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGoodsstyle() {
        return goodsstyle;
    }

    public void setGoodsstyle(String goodsstyle) {
        this.goodsstyle = goodsstyle == null ? null : goodsstyle.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getGoodsnumber() {
        return goodsnumber;
    }

    public void setGoodsnumber(String goodsnumber) {
        this.goodsnumber = goodsnumber == null ? null : goodsnumber.trim();
    }

    public String getGoodsunit() {
        return goodsunit;
    }

    public void setGoodsunit(String goodsunit) {
        this.goodsunit = goodsunit == null ? null : goodsunit.trim();
    }

    public String getStartprovince() {
        return startprovince;
    }

    public void setStartprovince(String startprovince) {
        this.startprovince = startprovince == null ? null : startprovince.trim();
    }

    public String getStarcity() {
        return starcity;
    }

    public void setStarcity(String starcity) {
        this.starcity = starcity == null ? null : starcity.trim();
    }

    public String getEndprovince() {
        return endprovince;
    }

    public void setEndprovince(String endprovince) {
        this.endprovince = endprovince == null ? null : endprovince.trim();
    }

    public String getEndcity() {
        return endcity;
    }

    public void setEndcity(String endcity) {
        this.endcity = endcity == null ? null : endcity.trim();
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    public String getTransporttime() {
        return transporttime;
    }

    public void setTransporttime(String transporttime) {
        this.transporttime = transporttime == null ? null : transporttime.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public Date getGissuedate() {
        return gissuedate;
    }

    public void setGissuedate(Date gissuedate) {
        this.gissuedate = gissuedate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request == null ? null : request.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}