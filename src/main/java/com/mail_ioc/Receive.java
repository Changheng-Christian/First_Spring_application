package com.mail_ioc;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by Emma on 2018/8/15.
 */

/**
 * @Author changheng.xu@hand-china.com
 * @Description //TODO 这是注释
 * @Date 18:38 2018-8-15
 * @Param
 * @return
 **/

@Component
public class Receive {
    @EventListener
    public void receive(MailEvent event){
        System.out.println("我是第一个处理");
        System.out.println("接收：");
        System.out.println(event.getTitle());
        System.out.println(event.getContext());
    }
}
