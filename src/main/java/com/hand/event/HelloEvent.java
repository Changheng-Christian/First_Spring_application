package com.hand.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author Changheng
 */
public class HelloEvent extends ApplicationEvent {

    private String name;


    /**
     * 为了避免被修改
     * 不要设置set方法
     * 如果需要，可以new一个新的类
     *
     * 所以这里只有get方法
     * @return
     */
    public String getName() {
        return name;
    }

    public HelloEvent(Object source) {
        super(source);
//        this.name = name
    }
}
