package com.xq.knowledge.dao;

import com.xq.knowledge.model.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapper {

    public SysUser getUserById(String userid);
}
