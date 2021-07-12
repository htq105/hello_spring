package com.hello.utils;

import org.springframework.context.ApplicationEvent;

/**
 * TODO: 描述
 *
 * @author htq
 * @classname UserEvent
 * @date 2021/6/18 20:25
 */
public class UserEvent extends ApplicationEvent {

    private String userPhone;

    public UserEvent(String userPhone) {
        super(userPhone);
        this.userPhone = userPhone;
    }
    public String getUserPhone() {
        return userPhone;
    }
}
