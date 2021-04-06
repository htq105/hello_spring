package com.utils;

import com.service.UserService;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * TODO: 描述
 *
 * @author htq
 * @classname ServiceFactory
 * @date 2021/3/30 18:20
 */
public class ServiceFactory {

    private static Properties env = new Properties();

    static{
        try {
            //获得IO输入流
            InputStream inputStream = ServiceFactory.class.getResourceAsStream("/bean.properties");
            env.load(inputStream);

            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Object getBean(String classPath){
        try {
            Class clazz = Class.forName(classPath);
            return clazz.newInstance();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static UserService getUserServiceBean(){
        //获取到类路径
        String classPath = env.getProperty("userService");
        return (UserService) getBean(classPath);
    }
}
