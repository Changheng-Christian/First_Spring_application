package com.mailsender;

import org.springframework.context.ApplicationEvent;

/**
 * @program: First_Spring_application
 * @description: Send EmailEntity class
 * @author: XU Chang Heng
 * @create: 2018-08-16 11:03
 **/

/**
 * ApplicationEvent类 没有无参构造方法，不能成为bean。
 */
public class SendEmail extends ApplicationEvent {

    private EmailEntity emailEntity;

    //构造方法
    public SendEmail(Object source,EmailEntity emailEntity) {
        super(source);
        this.emailEntity=emailEntity;
    }


    //无参构造方法。
    public SendEmail(Object source) {
        super(source);
    }

    public EmailEntity getEmailEntity() {
        return emailEntity;
    }

    public void setEmailEntity(EmailEntity emailEntity) {
        this.emailEntity = emailEntity;
    }
}





