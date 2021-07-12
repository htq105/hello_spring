package com.hello.utils;

import com.hello.service.UserService;
import org.springframework.beans.factory.InitializingBean;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * TODO: 描述
 *
 * @author htq
 * @classname ServiceFactory
 * @date 2021/3/30 18:20
 */
public class ServiceFactory {

    private Map<String,Object> cache = new ConcurrentHashMap<>();
    private static Properties env = new Properties();

    static{
        try {
            //读取配置文件
            InputStream inputStream = ServiceFactory.class.getResourceAsStream("/bean.properties");
            env.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //通过反射创建对象
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
//    //获取UserService对应的类路径，并创建该实体类返回
//    public static UserService getUserServiceBean() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        //获取到类路径
//        String classPath = env.getProperty("userService.class");
//        String initMethod = env.getProperty("userService.init_method");
//        Class clazz = Class.forName(classPath);
//        UserService userService = (UserService) clazz.newInstance();
//        Method initMethod = clazz.getDeclaredMethod("init");
//        if (! initMethod.isAccessible()) {
//            initMethod.setAccessible(true);
//        }
//        initMethod.invoke(userService);
//    }

    public  void initFactory() throws Exception {
        //1.获取到bean的相关属性
        String classPath = env.getProperty("userService.class");
        String initMethodName = env.getProperty("userService.init_method");
        String id = env.getProperty("userService.id");
        //2.创建bean，并将bean放入缓存
        UserService userService = (UserService) getBean(classPath);

        if(userService instanceof InitializingBean){
            InitializingBean init = (InitializingBean) userService;
            init.afterPropertiesSet();
        }


//        //3.调用bean的初始化方法
//        Method initMethod = userService.getClass().getDeclaredMethod(initMethodName);
//        //可以使用setAccessible将私有的方法设置为可访问
//        if (! initMethod.isAccessible()) {
//            initMethod.setAccessible(true);
//        }
//        initMethod.invoke(userService);
    }
}
