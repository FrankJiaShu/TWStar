package com.ljh.service.api;

import com.ljh.model.User;

/**
 * Created by ljh on 2017/11/12.
 * 用户业务层接口
 */

public interface IUserService {

    User selectUser(User user);

    String insertUser(User user);

}
