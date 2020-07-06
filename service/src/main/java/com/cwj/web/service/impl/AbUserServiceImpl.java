package com.cwj.web.service.impl;

import com.cwj.web.mapper.AbUserMapper;
import com.cwj.web.pojo.AbUser;
import com.cwj.web.service.AbUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 类名: AbUserServiceImpl
 * 介绍: AbUserServiceImpl
 * 时间: 2020/7/6 9:19
 * 作者: cwjyun
 */
@Service
public class AbUserServiceImpl implements AbUserService {
    @Resource
    AbUserMapper abUserMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return abUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<AbUser> selectAll() {
        return abUserMapper.selectAll();
    }
}
