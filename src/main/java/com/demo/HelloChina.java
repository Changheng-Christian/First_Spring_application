package com.demo;

public class HelloChina implements IHelloMessage {
    /**
     * 1.创建抽象方法sayHello(),用于定义输出问候信息
     * 2.创建HelloWorld和HelloChina两个类实现接口IHelloMessage，实现sayHello（）方法
     */
    @Override
    public String sayHello() {
        return "大家好。";
    }
}
