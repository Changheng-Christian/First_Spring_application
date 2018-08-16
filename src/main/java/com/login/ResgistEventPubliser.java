package com.login;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;


/**
 * @program: First_Spring_application
 * @description: registeventpubliser
 * @author: XU Chang Heng
 * @create: 2018-08-15 22:20
 **/

/**
 * component重命名为“Publisher”，此名字唯一。
 */
@Component ("Publiser")
public class ResgistEventPubliser implements ApplicationEventPublisherAware {

    /**
     * 定义本地变量，接收主方法入口传递过来的参数
     */
    private String phone = null;
    private String email = null;

    /**
     * get和set方法
     * @return
     */
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

    /**
     * 申明一个变量，实例化applicationEventPublisher，调用ApplicationEventPublisherAware抽象接口里面的publishEvent（）方法
     */
    private ApplicationEventPublisher applicationEventPublisher;


    /**
     * 实现接口的抽象方法
     */
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    /**
     * 自定义一个方法提供给主函数入库， 调用抽象接口里面的publishEvent（）方法。
     */
    public void publish(){
        applicationEventPublisher.publishEvent(new EmailEvent("需要验证的email: "+ email));
        applicationEventPublisher.publishEvent(new PhoneEvent("需要验证的Phone："+ phone));
    }
}

