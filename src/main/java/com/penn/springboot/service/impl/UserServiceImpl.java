package com.penn.springboot.service.impl;

import com.penn.springboot.service.UserService;

/**
 * Created by Administrator on 2019/1/13.
 */
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "Penn";
    }
}
