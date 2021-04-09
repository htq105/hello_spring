package com.service.impl;

import com.service.UserService;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

/**
 * TODO: 描述
 *
 * @author htq
 * @classname UserService
 * @date 2021/3/25 9:28
 */
public class UserServiceImpl implements UserService , InitializingBean {


    private void init() {
        System.out.println("init method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}
