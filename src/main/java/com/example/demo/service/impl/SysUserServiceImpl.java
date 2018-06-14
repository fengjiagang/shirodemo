package com.example.demo.service.impl;

import com.example.demo.dao.entity.SysUser;
import com.example.demo.dao.mapper.SysUserMapper;
import com.example.demo.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser getUserById(long userid) {
        return sysUserMapper.selectByPrimaryKey(userid) ;
    }

    @Override
    public boolean addUser(SysUser sysUser) {
        boolean result = false;
        try {
            sysUserMapper.insert(sysUser);
            result = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
