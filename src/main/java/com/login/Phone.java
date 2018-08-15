package com.login;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @program: First_Spring_application
 * @description: phone
 * @author: XU Chang Heng
 * @create: 2018-08-15 20:25
 **/
@Component
public class Phone implements ApplicationListener<PhoneEvent> {


    @Override
    public void onApplicationEvent(PhoneEvent phoneEvent) {
        System.out.println("请验证你的手机号码："+phoneEvent.getSource());

    }
}

