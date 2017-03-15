package com.wuliu.pojo;

import java.util.Date;

public class placard {
    private Integer pid;

    private String title;

    private String author;

    private Date pissuedate;

    private String content;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Date getPissuedate() {
        return pissuedate;
    }

    public void setPissuedate(Date pissuedate) {
        this.pissuedate = pissuedate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}