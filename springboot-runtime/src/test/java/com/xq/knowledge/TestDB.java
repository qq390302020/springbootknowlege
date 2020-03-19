package com.xq.knowledge;

import com.xq.knowledge.dao.SysUserMapper;
import com.xq.knowledge.model.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDB {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    public void testDB(){
        SysUser user = sysUserMapper.getUserById("admin");
        System.out.println(user.toString());
    }

}
