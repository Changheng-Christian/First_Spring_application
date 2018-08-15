package com.hand.handler;

import com.hand.event.HelloEvent;
import org.springframework.context.event.EventListener;

public class HelloEventHandler {
    @EventListener
    public void handle(HelloEvent helloEvent){

    }

}
