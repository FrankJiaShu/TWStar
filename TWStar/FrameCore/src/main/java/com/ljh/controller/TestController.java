package com.ljh.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by ljh on 2017/11/18.
 */
@Controller
public class TestController {

    private static Logger logger = Logger.getLogger(TestController.class);
    @RequestMapping("/test")
    public ModelAndView test(HttpServletRequest request, HttpServletResponse response){
        String user = request.getParameter("userId");
        logger.info("userId:"+user);
        return new ModelAndView("menu");
    }

}
