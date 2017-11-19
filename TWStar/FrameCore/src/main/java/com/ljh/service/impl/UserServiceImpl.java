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
    private IUserDao iUserDao;
    private static Logger logger = Logger.getLogger(UserServiceImpl.class);

    public User getUser(String userId,String password) {
        logger.info("服务层:UserServiceImpl开始执行!");
        return iUserDao.selectUser(userId,password);
    }

}
