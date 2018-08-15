package com.login;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @program: First_Spring_application  等待相应。
 * @description: email
 * @author: XU Chang Heng
 * @create: 2018-08-15 20:27
 **/
@Component
public class Email implements ApplicationListener<EmailEvent> {

    @Override
    public void onApplicationEvent(EmailEvent emailEvent) {
        System.out.println("请验证你的邮箱："+emailEvent.getSource());
    }
}

