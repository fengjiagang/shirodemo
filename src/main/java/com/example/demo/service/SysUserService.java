package com.example.demo.service;

import com.example.demo.dao.entity.SysUser;

public interface SysUserService {
    public SysUser getUserById(long userid);

    boolean addUser(SysUser sysUser);
}
