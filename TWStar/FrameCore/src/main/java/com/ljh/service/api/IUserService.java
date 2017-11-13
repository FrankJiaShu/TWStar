package com.ljh.service.api;

import com.ljh.model.User;

/**
 * Created by ljh on 2017/11/12.
 */

public interface IUserService {

    User getUser(String userId,String password);

}
