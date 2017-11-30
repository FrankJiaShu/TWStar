package com.ljh.service.impl;

import com.ljh.dao.IUserDao;
import com.ljh.model.User;
import com.ljh.service.api.IUserService;
import com.ljh.utils.GenerateNum;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by ljh on 2017/11/12.
 * 用户业务层处理
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao iUserDao;
    @Resource
    private GenerateNum generateNum;

    private static Logger logger = Logger.getLogger(UserServiceImpl.class);

    public User selectUser(User user) {
        logger.info("UserServiceImpl执行方法->selectUser()");
        logger.info("获取到账号:"+user.getUserId()+" 密码:"+user.getPassword());
        return iUserDao.selectUser(user);
    }

    public String insertUser(User user) {
        logger.info("UserServiceImpl执行方法->insertUser()");
        try {
            String className = this.getClass().getName();
            String seqName = className.split("S")[0]+"Seq";
            //调用utils生成账户账号
            user.setUserId(generateNum.getUserId(seqName));
            logger.info("组装后的用户数据为->账号:"+ user.getUserId() +
                    " 用户名:"+user.getUserName() + " 密码:" + user.getPassword());
            iUserDao.insertUser(user);
        } catch (Exception e) {
            logger.error("插入User数据错误！");
            logger.error(e);
            return "error";
        }
        String userId = user.getUserId();
        logger.info("插入User数据成功！userId为:"+userId);
        return userId;
    }

}
