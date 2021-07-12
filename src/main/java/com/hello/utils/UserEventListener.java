package com.hello.utils;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * TODO: 描述
 *
 * @author htq
 * @classname UserEventListener
 * @date 2021/6/18 20:21
 */
@Component
public class UserEventListener implements ApplicationListener<UserEvent>{

    @Async
    @Override
    public void onApplicationEvent(UserEvent event) {
        String userName = event.getUserPhone();
        System.out.println("发送短信中......");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发送短信成功" + userName);
    }
}
