package com.mail_ioc;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @program: First_Spring_application
 * @description: Reciver
 * @author: XU Chang Heng
 * @create: 2018-08-15 20:11
 **/
@Component
public class Reciver {
    @EventListener
    public void reaponse(MailEvent event){
        System.out.println("被监听到了。");
        System.out.println("我是第2个处理");
        System.out.println("接收2：");
        System.out.println(event.getTitle());
        System.out.println(event.getContext());
    }


}

