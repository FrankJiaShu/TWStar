package com.ljh.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ljh on 2017/11/28.
 * 控制页面的跳转
 */
@Controller
@RequestMapping("/page")
public class PageController {
    private static Logger logger = Logger.getLogger(PageController.class);
    @RequestMapping("/pageForward")
    private ModelAndView pageForward (String pageName) throws Exception {
        logger.info("执行PageController->pageForward()");
        return new ModelAndView(pageName);
    }
}
