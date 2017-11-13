package com.ljh.service.impl;

import com.ljh.dao.IUserDao;
import com.ljh.model.User;
import com.ljh.service.api.IUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ljh on 2017/11/12.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;
    private static Logger logger;

    public User getUser(String userId,String password) {
        logger = Logger.getLogger(UserServiceImpl.class);
        logger.info("服务层:UserServiceImpl开始执行!");
        return userDao.selectUser(userId,password);
    }

}
