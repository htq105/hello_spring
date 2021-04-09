package com.controller;

import com.service.UserService;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * TODO: 描述
 *
 * @author htq
 * @classname UserController
 * @date 2021/3/25 9:27
 */
@Controller
public class UserController {

    UserService userService;

    public UserService getUserService() {
        return null;
    }

    public void test(){
        System.out.println(getUserService());
    }
}
