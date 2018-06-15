package com.ns.clould.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ns.clould.bean.UserMain;
import com.ns.clould.mapper.UserMainMapper;

@Service
public class UserMainServiceImpl implements UserMainService {
    @Autowired
    private UserMainMapper userMainMapper;
    @Override
    public UserMain selectByPrimaryKey(int userid) {
        return userMainMapper.selectByPrimaryKey(userid);
    }
}
