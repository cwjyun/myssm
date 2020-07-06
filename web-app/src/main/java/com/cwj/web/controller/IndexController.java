package com.cwj.web.controller;

import com.cwj.web.pojo.AbUser;
import com.cwj.web.service.AbUserService;
import com.cwj.web.utils.ExecuteResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


/**
 * 类名: IndexController
 * 介绍: IndexController
 * 时间: 2020/7/2 16:22
 * 作者: cwjyun
 */

@RestController
@RequestMapping("index")
public class IndexController {
    @Resource
    AbUserService abUsers;
    @RequestMapping("/user")
    @ResponseBody
    public ExecuteResult index() {
        List<AbUser> abUsers = this.abUsers.selectAll();
        System.out.println("xxxx");
        return new ExecuteResult().success(abUsers);
    }
}
