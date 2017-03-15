package com.wuliu.pojo;

import java.util.Date;

public class knowledge {
    private Integer kid;

    private String title;

    private String author;

    private Date kissuedate;

    private String content;

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
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

    public Date getKissuedate() {
        return kissuedate;
    }

    public void setKissuedate(Date kissuedate) {
        this.kissuedate = kissuedate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}