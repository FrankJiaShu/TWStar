package com.ljh.controller;

import com.alibaba.fastjson.JSON;
import com.ljh.model.User;
import com.ljh.service.api.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/**
 * Created by ljh on 2017/11/12.
 * 控制用户的相关操作
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;
    @Resource
    private User user;

    private static Logger logger = Logger.getLogger(UserController.class);

    @RequestMapping("/userLogin")
    private ModelAndView userLogin (User userInfo) throws Exception {
        logger.info("UserLoginController执行方法->userLogin()");
        //调用业务层验证登录用户
        user = userService.selectUser(userInfo);
        Map<String,Object> model = new HashMap<String, Object>();
        if (user != null) {
//            logger.info("转换后json为:"+JSON.toJSONString(user));
            model.put("jsonUser",JSON.toJSONString(user));//暂时不处理这里的json数据
            return new ModelAndView("menu",model);
        } else {
            model.put("error","账号或密码不正确！");
            return new ModelAndView("login",model);
        }
    }

    @RequestMapping("/userInsert")
    @ResponseBody
    private String userInsert (User userInfo) throws Exception {
        logger.info("UserLoginController执行方法->userInsert()");
        //调用业务层插入用户表
        String userId = userService.insertUser(userInfo);
        //使用ajax异步通信，只返回结果不返回视图
        if (userId.equals("error")) {
            return "注册失败！";
        } else {
            return "注册成功！您的账号是: "+userId;
        }
    }

}
