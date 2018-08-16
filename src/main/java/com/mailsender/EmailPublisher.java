package com.mailsender;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: First_Spring_application
 * @description: EmailPublisher
 * @author: XU Chang Heng
 * @create: 2018-08-16 11:17
 **/
public class EmailPublisher {
    public static void main(String[] args) {
        String receiveName = "Jack";
        String postName = "tom@gmail.com";
        String subject = "hello jack";
        String text = "Good morning Jack.";

        EmailEntity emailEntity = new EmailEntity(receiveName, postName, subject, text);

        /**
         * ApplicationEventPublisher是一个接口，ApplicationContext是一个实现了ApplicationEventPublisher 这个接口的类，
         *
         * ApplicationContext这个类中实现了（重写了）ApplicationEventPublisher中的抽象方法，
         *
         * 当（ApplicationEventPublisher applicationEventPublisher=applicationContext;）声明这个applicationEventPublisher实体的时候，applicationEventPublisher可以调用在ApplicationContext类里面经过重写的publishEvent（）方法，
         *  而这个方法是ApplicationEventPublisher接口中的抽象方法。
         *
         * 所以，可以写为：ApplicationEventPublisher applicationEventPublisher =new ClassPathXmlApplicationContext("mailsender/mailsender.xml");
         *
         *  简写 ： A接口，B类    B类实现A接口，重写（override）A接口的抽象方法。       申明：A a = new B（）；    a实例如果调用方法，所调用的是B类重写A类的方法。
         */

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mailsender/mailsender.xml");

        //1.
        ApplicationEventPublisher applicationEventPublisher=applicationContext;
        applicationEventPublisher.publishEvent(new SendEmail(new EmailPublisher(),emailEntity));

        /**
         * 2.
         * 1. 和 2. 等价
         * applicationContext.publishEvent(new SendEmail(new EmailPublisher(),emailEntity));
         */

        System.out.println("邮件发送成功。");
        System.out.println("------------邮件内容如下------------");

        /**
         * 通过配置文件中的name=“ReceiveEmail” 来获得ReceiveEmail对象，并传给SendEmail类进行打印输出获取到的邮件信息。
         */
        ReceiveEmail receiveEmail=(ReceiveEmail) applicationContext.getBean("ReceiveEmail");
        receiveEmail.reciveEmail(emailEntity);
    }
}

