package com.ljh.dao;

import com.ljh.model.User;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


/**
 * Created by ljh on 2017/11/12.
 */
@Repository
public interface IUserDao {
    void deleteByPrimaryKey(String userId);

    void insert(User user);

    void insertSelective(User user);
    /*动态代理多参数传值加@Param*/
    User selectUser(@Param("userId")String userId, @Param("password")String password);

    void updateByPrimaryKeySelective(User user);

    void updateByPrimaryKey(User user);

}
