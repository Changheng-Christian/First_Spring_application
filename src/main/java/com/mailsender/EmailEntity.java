package com.mailsender;

/**
 * @program: First_Spring_application
 * @description: EmailEntity
 * @author: XU Chang Heng
 * @create: 2018-08-16 11:14
 **/
public class EmailEntity {
    private String recviename;
    private String psotname;
    private String subject;
    private String text;

    //get and set method
    public String getRecviename() {
        return recviename;
    }

    public void setRecviename(String recviename) {
        this.recviename = recviename;
    }

    public String getPsotname() {
        return psotname;
    }

    public void setPsotname(String psotname) {
        this.psotname = psotname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    //构造方法
    public EmailEntity(String recviename, String psotname, String subject, String text) {
        this.recviename = recviename;
        this.psotname = psotname;
        this.subject = subject;
        this.text = text;
    }

    //无参构造方法
    public EmailEntity() {
    }
}

