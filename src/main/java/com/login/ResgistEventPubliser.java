package com.login;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import java.util.Scanner;

/**
 * @program: First_Spring_application
 * @description: logineventpubliser
 * @author: XU Chang Heng
 * @create: 2018-08-15 22:20
 **/
@Component ("Publiser")
public class ResgistEventPubliser implements ApplicationEventPublisherAware {
    private String phone = null;
    private String email = null;


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




    //神明一个变量，实例
    private ApplicationEventPublisher applicationEventPublisher;



    //实现接口的抽象方法
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;


    }


    //自定义一个方法， 调用抽象接口里面的publishEvent（）方法。
    public void publish(){
        applicationEventPublisher.publishEvent(new EmailEvent("需要验证的email: "+ email));
        applicationEventPublisher.publishEvent(new PhoneEvent("需要验证的Phone："+ phone));
    }
}

