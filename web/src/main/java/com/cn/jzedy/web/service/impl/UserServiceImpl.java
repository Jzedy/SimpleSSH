package com.cn.jzedy.web.service.impl;

import com.cn.jzedy.core.service.impl.BaseServiceImpl;
import com.cn.jzedy.web.mapper.UsersMapper;
import com.cn.jzedy.web.repository.Users;
import com.cn.jzedy.web.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @auther Jzedy
 * @time 2018/7/21 23:14
 * @description
 */
@Service(value = "userService")
public class UserServiceImpl extends BaseServiceImpl<Users> implements UserService {

    private UsersMapper usersMapper;

    protected void setBaseRepository(UsersMapper usersMapper) {
        super.setBaseRepository(usersMapper);
        this.usersMapper = usersMapper;
    }


}
