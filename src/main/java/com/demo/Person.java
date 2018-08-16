package com.demo;

/**
 * @author Changheng
 */
public class Person {

    /**
     * 3.创建Person类，调用IHelloMessage接口，向用户输出问候信息。
     *
     * 4.因为Person类需要引用IHelloMessage这个接口，所以在Person类里面讲IHelloMessage作为他的一个属性。
     *
     * 5.为IHelloMessage属性设置get和set方法。
     */

    private IHelloMessage helloMessage;

    public IHelloMessage getHelloMessage() {
        return helloMessage;
    }

    public void setHelloMessage(IHelloMessage helloMessage) {
        this.helloMessage = helloMessage;
    }

    /**
     * 6.为Person类创建sayHello（）方法，用来调用IHelloMessage接口的sayHello（）方法，向大家输出问候信息
     *
     * 7.创建Main程序入口，用于加载配置文件和启动IOC容器，调用人物类，向用户输出问候信息。
     */
    public String sayHello(){
        return this.helloMessage.sayHello();
    }
}
