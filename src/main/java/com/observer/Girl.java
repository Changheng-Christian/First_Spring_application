package com.observer;

import java.util.Observable;

/**
 * @program: First_Spring_application
 * @description: Observable 被观察者 继承Observable类
 * @author: XU Chang Heng
 * @create: 2018-08-16 10:19
 **/
public class Girl extends Observable {
    private String name="";
    private String thing="";

    //构造方法，只有名字参数
    public Girl(String name) {
        this.name = name;
    }

    //定义一个做事情的方法，提示观察者
    public void doSomething(String thing){
        this.thing=thing;

        this.setChanged();
        this.notifyObservers();
    }

    //定义一个状态方法，返回做的事情
    public String getStatus(){
        return thing;
    }
    //定义一个获取名字的方法
    public String getName(){
        return name;
    }


}

