package com.hello.utils;

import org.springframework.beans.BeansException;

import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.stereotype.Component;

/**
 * TODO: 描述
 *
 * @author htq
 * @classname BeanFactory
 * @date 2021/6/18 19:15
 */
@Component
public class BeanFactory  implements LoadTimeWeaverAware {

    @Override
    public void setLoadTimeWeaver(LoadTimeWeaver loadTimeWeaver) {
        System.out.println(loadTimeWeaver);
    }
}
