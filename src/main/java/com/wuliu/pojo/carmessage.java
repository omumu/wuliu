package com.wuliu.pojo;

import java.util.Date;

public class carmessage {
    private Integer code;

    private String trademark;

    private String brand;

    private String style;

    private String carload;

    private String usedtime;

    private String drivername;

    private String drivertime;

    private String licencenumber;

    private String licencestyle;

    private String transpotstyle;

    private String linkman;

    private String linkphone;

    private String remark;

    private Date carissuedate;

    private String username;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark == null ? null : trademark.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    public String getCarload() {
        return carload;
    }

    public void setCarload(String carload) {
        this.carload = carload == null ? null : carload.trim();
    }

    public String getUsedtime() {
        return usedtime;
    }

    public void setUsedtime(String usedtime) {
        this.usedtime = usedtime == null ? null : usedtime.trim();
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername == null ? null : drivername.trim();
    }

    public String getDrivertime() {
        return drivertime;
    }

    public void setDrivertime(String drivertime) {
        this.drivertime = drivertime == null ? null : drivertime.trim();
    }

    public String getLicencenumber() {
        return licencenumber;
    }

    public void setLicencenumber(String licencenumber) {
        this.licencenumber = licencenumber == null ? null : licencenumber.trim();
    }

    public String getLicencestyle() {
        return licencestyle;
    }

    public void setLicencestyle(String licencestyle) {
        this.licencestyle = licencestyle == null ? null : licencestyle.trim();
    }

    public String getTranspotstyle() {
        return transpotstyle;
    }

    public void setTranspotstyle(String transpotstyle) {
        this.transpotstyle = transpotstyle == null ? null : transpotstyle.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getLinkphone() {
        return linkphone;
    }

    public void setLinkphone(String linkphone) {
        this.linkphone = linkphone == null ? null : linkphone.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCarissuedate() {
        return carissuedate;
    }

    public void setCarissuedate(Date carissuedate) {
        this.carissuedate = carissuedate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}