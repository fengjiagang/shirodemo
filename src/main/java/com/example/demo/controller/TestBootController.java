package com.example.demo.controller;

import com.example.demo.dao.entity.SysUser;
import com.example.demo.model.User;
import com.example.demo.service.SysUserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@EnableAutoConfiguration
@RequestMapping("/test")
public class TestBootController {

    @Resource
    private SysUserService sysUserService;

    @RequestMapping("/getuser")
    public User getUser(){
        User user = new User();
        user.setName("test");
        return user;
    }

    @RequestMapping("/getUserById")
    public User getUserById(@RequestParam("id") long id){
        SysUser sysUser = sysUserService.getUserById(id);
        User user = new User();
        user.setName(sysUser.getUsername());
        return user;
    }

}
