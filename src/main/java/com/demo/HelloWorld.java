package com.demo;

public class HelloWorld implements IHelloMessage {
    /**
     * 2.创建HelloWorld和HelloChina两个类实现接口IHelloMessage，实现sayHello（）方法
     * @return
     */


    @Override
    public String sayHello() {
        return "Hello everybody";
    }
}
