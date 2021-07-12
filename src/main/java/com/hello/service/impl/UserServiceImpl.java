package com.hello.service.impl;

import com.hello.service.UserService;
import com.hello.utils.UserEvent;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

import javax.annotation.Resource;

/**
 * TODO: 描述
 *
 * @author htq
 * @classname UserService
 * @date 2021/3/25 9:28
 */
@Service
public class UserServiceImpl implements UserService{

    private String name;

    @Resource
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void register(String userName) throws InterruptedException {
        applicationEventPublisher.publishEvent(new UserEvent(userName));
        System.out.println("保存用户信息到数据库...");
        Thread.sleep(1000);
        System.out.println("保存成功");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println("init");
    }
}
