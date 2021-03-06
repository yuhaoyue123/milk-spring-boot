package com.neu.yang.entity;

import java.sql.Date;

public class Person {
    private Integer uid;
    private Date date;
    private String cname;
    private String title;
//    private Boolean bool;
    private Integer status;
    private Integer number;
    private String type;
    private String space;
    private String introduce;

    public Person() {
    }

    public Person(Integer uid, Date date, String cname, String title, Integer status, Integer number, String type, String space, String introduce) {
        this.uid = uid;
        this.date = date;
        this.cname = cname;
        this.title = title;
        this.status = status;
        this.number = number;
        this.type = type;
        this.space = space;
        this.introduce = introduce;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
