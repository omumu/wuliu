package com.wuliu.pojo;

import java.util.Date;

public class logistics {
    private Integer lid;

    private String title;

    private String author;

    private Date lissuedate;

    private String content;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
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

    public Date getLissuedate() {
        return lissuedate;
    }

    public void setLissuedate(Date lissuedate) {
        this.lissuedate = lissuedate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}