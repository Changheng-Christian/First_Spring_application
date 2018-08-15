package com.mail;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * @author Changheng
 */
public class MyMailSender {

    /**
     * 将Spring的JavaMailSender接口设置为MailSenderDemo的一个属性。
     */
    private JavaMailSender mailSender;

    /**
     * 默认的构造方法
     */
    public MyMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    /**
     * 创建sendEmail（）方法，使用实例化JavaMailSender类后创建的mailSender对象调用send（）方法
     *
     * @param mail
     */
    public void sendEmail(SimpleMailMessage mail){
        mailSender.send(mail);
    }
}
