package com.observer;

import java.util.Observable;

/**
 * @program: First_Spring_application
 * @description: 古董被观察，观察者为人用来观察古董的价格变化
 * @author: XU Chang Heng
 * @create: 2018-08-16 09:20
 **/
public class Antique extends Observable {

    //古董的价钱
    private float price;

    //构造方法
    public Antique(float price) {
        this.price = price;
    }

    //get和set方法
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {

        /**
         * new add。
         */
        super.setChanged();
        // 价格被改变
        super.notifyObservers(price);


        this.price = price;
    }

    @Override
    public String toString() {
        return "Antique{" +
                "price=" + price +
                '}';
    }
}

