package com.login;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: First_Spring_application
 * @description: main 启动程序
 * @author: XU Chang Heng
 * @create: 2018-08-15 22:55
 **/
public class Main {
    public static void main(String[] args) {


    String name = "Jack";
    String phone = "110";
    String email = "119@hand.com";


    //加载配置文件
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("login/login.xml");

    //获取publisher实例。。  getBean获取到的是对象，子类引用指向父类对象，需要向下强转
    LoginEventPubliser loginEventPubliser = (LoginEventPubliser) applicationContext.getBean("Publiser");

    //使用pblisher实例调用Pblisher里面的方法，将主方法的参数设置进去
    loginEventPubliser.setPhone(phone);
    loginEventPubliser.setEmail(email);

    //发布
    loginEventPubliser.publish();

    }

}

