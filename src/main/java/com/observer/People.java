package com.observer;

import org.apache.commons.logging.Log;

import java.util.Observable;
import java.util.Observer;


/**
 * @program: First_Spring_application
 * @description: 观察者，被动响应类
 * @author: XU Chang Heng
 * @create: 2018-08-16 09:26
 **/
public class People implements Observer {
    private String name;
    private float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * 构造函数，用于实例化People类（主方法中使用了。）
     * @param people
     */
    public People(String people) {

    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("People update() -> update name:"+ this.name + ",price:"+ ((Float)arg).floatValue());
    }
}

