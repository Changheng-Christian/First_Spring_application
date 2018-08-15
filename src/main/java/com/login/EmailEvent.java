package com.login;

import org.springframework.context.ApplicationEvent;

/**
 * @program: First_Spring_application
 * @description: emailevent
 * @author: XU Chang Heng
 * @create: 2018-08-15 22:50
 **/
public class EmailEvent extends ApplicationEvent {
    /**
    * @Description: 构造方法，调用父类方法
    * @Param: [source]
    * @return:
    * @Author: Xu Chang Heng
    * @Date: 2018-8-15
    */

    //调用父类构造方法
    public EmailEvent(Object source) {
        super(source);
    }
}

