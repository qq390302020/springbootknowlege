package com.xq.knowledge.service;


import com.xq.knowledge.dao.SysUserMapper;
import com.xq.knowledge.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    public SysUser getUserById(String userid) {
        return sysUserMapper.getUserById(userid);
    }
}
