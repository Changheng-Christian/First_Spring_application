package com.hand.mail;

import com.mail.MyMailSender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;

import java.util.Scanner;

public class SendTest {
    public static void main(String[] args) {
        /**
         * 参考链接：https://blog.csdn.net/Guerlei/article/details/53189522
         *
         * 1.加载配置文件 spring-mail.xml和applicationContext.xml
         *
         * 2.通过 Spring 实例化一个 MyMailSender 的对象 sender，sender 会调用 MyMailSender 里面自定义的 sendEmail 方法。（其实是实现了 JavaMailSender 接口的 send（）方法）。
         *
         * 3.实例化一个 Spring 的 SimpleMailMessage 对象，命名为 mail，用来存放发送的: 1.邮件收件人地址, 2.发件人， 3.邮件主题, 邮件正文。
         *
         * 4.JavaMailSender接口的send（）方法没有返回值，所以没有办法看到是否发送成功，这里的打印信息只是用于提示程序运行结束。
         *
         *
         * Besides：
         *
         * 一. ClassPathXmlApplicationContext 这种形式的 Spring 配置文件的加载过程如下：
         *
         *  A：加载配置文件名到系统配置
         *
         *  B：销毁已有的 Beans 和 BeanFactory
         *
         *  C：创建新的 BeanFactory
         *
         *  D：加载 Beans，分析 Bean 中的节点，然后加载到 BeanFactory，BeanFactory 生效。
         *
         * 二. ApplicationContext
         *
         *  ApplicationContext 的主要实现类是 ClassPathXmlApplicationContext 和 FileSystemXmlApplicationContext, 前者默认从类路径加载配置文件，后者默认从文件系统加载文件。
         *
         *  如果配置文件放在类路径下，直接使用 ClassPathXmlApplicationContext 实现类:
         *
         *  ApplicationContext ctx=new ClassPathXmlApplicationContext("com/techman/context/beans.xml");
         *
         *  这里的参数等同于:"classpath:com/techman/context/beans.xml"
         *
         *  如果配置文件在文件系统的路径下，则可以优先考虑使用 FileSystemXmlApplicationContext 实现类：
         *
         *  ApplicationContext ctx=new FileSystemXmlApplicationContext("com/techman/context/beans.xml");
         *
         *  这里的参数等同于:"file:com/techman/context/beans.xml".
         *
         *  还可以指定一组配置文件，Spring 自动将多个配置文件在内存中整合成一个配置文件：
         *
         *  ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[]{"conf/bean1.xml","conf/bean2.xml"});
         *
         */

        ApplicationContext ac = new ClassPathXmlApplicationContext("mail/spring-mail.xml", "applicationContext.xml");
        MyMailSender sender = (MyMailSender)ac.getBean("MyMailSender");
        SimpleMailMessage mail = new SimpleMailMessage();
        //发件人
        mail.setFrom("changheng.xu@hand-china.com");
//        //收件人邮箱地址
//        mail.setTo("xuhengiverson@163.com");
//        //主题
//        mail.setSubject("spring自带javamail发送的邮件");
//        //正文
//        mail.setText("hello this mail is from spring javaMail ");

        /**
         * 控制台输入发送内容
         *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Which E-mail do your want to send to?");
        String emailAddress = scanner.nextLine();
        mail.setTo(emailAddress);
        System.out.println("--What's your subject?");
        String emailSubject = scanner.nextLine();
        mail.setSubject(emailSubject);
        System.out.println("--What do you want to say to "+emailAddress);
        String emailText = scanner.nextLine();
        mail.setText(emailText);
        System.out.println("The e-mail is sending, please wait for a moment...");


        sender.sendEmail(mail);
        System.out.println("Send mail successfully.");
    }
}
