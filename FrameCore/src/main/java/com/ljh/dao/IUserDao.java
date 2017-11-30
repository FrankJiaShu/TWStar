package com.ljh.dao;

import com.ljh.model.User;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


/**
 * Created by ljh on 2017/11/12.
 */
@Repository
public interface IUserDao {
    /*动态代理多参数传值需要加@Param*/
    User selectUser(User user);

    void insertUser(User user) throws Exception;

    void deleteByPrimaryKey(String userId);

    void insertSelective(User user);

    void updateByPrimaryKeySelective(User user);

    void updateByPrimaryKey(User user);

}
