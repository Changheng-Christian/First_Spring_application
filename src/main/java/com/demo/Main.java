package com.demo;

/*****
 * main方法需要引入spring开发包
 */
import org.springframework.beans.factory.BeanFactory;
import  org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Main {
    public static void main(String[] args) {

        /**
         * 8.利用ClassPathResource来读取配置文件
         * 9.使用XmlBeanFactory来加载配置文件，启动IOC容器
         * 10.从IOC容器中获取Person类的实例。
         * 11.用Person类的实例调用IHelloMessage接口的实现的sayHello方法向大家输出问候信息
         *
         * 12.为示例代码创建配置文件helloMessage.xml文件
         */
        Resource r = new ClassPathResource("demo/helloMessage.xml");
        BeanFactory f = new XmlBeanFactory(r);
        Person person = (Person) f.getBean("person");
        String s = person.sayHello();
        System.out.println("The person is currently saying "+s);
    }
}
