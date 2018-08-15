package com.login;

import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.context.ApplicationEvent;

/**
 * @program: First_Spring_application
 * @description: phoneevent
 * @author: XU Chang Heng
 * @create: 2018-08-15 22:52
 **/
public class PhoneEvent extends ApplicationEvent {

    /**
    * @Description: 调用父类构造方法
    * @Param: [source]
    * @return:
    * @Author: Xu Chang Heng
    * @Date: 2018-8-15
    */
    public PhoneEvent(Object source) {
        super(source);
    }
}

