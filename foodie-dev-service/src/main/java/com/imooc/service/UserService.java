package com.imooc.service;

import com.imooc.pojo.Stu;
import com.imooc.pojo.Users;
import com.imooc.pojo.bo.UserBO;

public interface UserService {

    boolean userNameIsExists(String userName);

    /**
     * 判断用户名是否存在
     */
    Users createUser(UserBO userBO);


    /**
     * 检索用户名和密码是否匹配，用于登录
     */
     Users queryUserForLogin(String username, String password);
}
