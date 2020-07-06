package com.cwj.web.service;

import com.cwj.web.pojo.AbUser;

import java.util.List;

/**
 * 类名: AbUserService
 * 介绍: AbUserService
 * 时间: 2020/7/6 9:18
 * 作者: cwjyun
 */
public interface AbUserService {
    int deleteByPrimaryKey(Integer id);
    List<AbUser> selectAll();
}
