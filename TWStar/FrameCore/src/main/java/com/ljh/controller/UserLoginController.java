package com.ljh.controller;

import com.ljh.model.User;
import com.ljh.service.api.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/**
 * Created by ljh on 2017/11/12.
 */
@Controller
public class UserLoginController extends AbstractController{

    @Resource
    private IUserService userService;
    @Resource
    private User user;
    //增加日志记录
    private static Logger logger;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger = Logger.getLogger(UserLoginController.class);
        logger.info("进入用户登录控制器UserLoginController!");
        Map<String,Object> model = new HashMap<String, Object>();
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        logger.info("获取账号:"+userId+" 密码:"+password);
        user = userService.getUser(userId,password);
        if (userId != null) {
            user.setUserId(userId);
            user.setPassword(password);
            model.put("user",user);
            return new ModelAndView("menu",model);
        } else {
            model.put("error","账号或密码不正确！");
            return new ModelAndView("index",model);
        }
    }

}
