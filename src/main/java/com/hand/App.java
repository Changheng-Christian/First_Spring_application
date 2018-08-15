package com.hand;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //applicationContext接口
        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("hand/ioc.xml");
//        applicationContext1.getBean(String.class);
//        System.out.println(applicationContext1.getBean("hand"));


        ApplicationEventPublisher applicationEventPublisher = applicationContext1;
//        applicationEventPublisher.publishEvent(new App[]);
    }
}
