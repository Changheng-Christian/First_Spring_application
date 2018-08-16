package com.mailsender;


/**
 * @program: First_Spring_application
 * @description: recive email class
 * @author: XU Chang Heng
 * @create: 2018-08-16 11:24
 **/
public class ReceiveEmail {

    public void reciveEmail(EmailEntity emailEntity){
        System.out.println("发件人"+emailEntity.getPsotname());
        System.out.println("收件人"+emailEntity.getRecviename());
        System.out.println("邮件主题"+emailEntity.getSubject());
        System.out.println("邮件内容"+emailEntity.getText());
    }

}

