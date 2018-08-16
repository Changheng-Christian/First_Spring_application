package com.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @program: First_Spring_application
 * @description: Observer 实现Observer接口
 * @author: XU Chang Heng
 * @create: 2018-08-16 10:16
 **/
public class Boy implements Observer {

    private String name="";

    //get方法
    public String getName() {
        return name;
    }

    //构造方法
    public Boy(String name) {
        this.name = name;
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

        Girl girl=(Girl)o;

        System.out.println(name+" 看到 "+girl.getName()+" "+girl.getStatus());
    }
}

