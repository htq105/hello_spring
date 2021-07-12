package com.hello.utils;

import org.springframework.context.LifecycleProcessor;

/**
 * TODO: 描述
 *
 * @author htq
 * @classname Process
 * @date 2021/4/28 20:34
 */
public class Process implements LifecycleProcessor {
    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public void onRefresh() {
        System.out.println("onRefresh");
    }

    @Override
    public void onClose() {
        System.out.println("onClose");
    }
}
