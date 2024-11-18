package com.jasper.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jasper.annotation.Log;
import com.jasper.domains.Users;
import com.jasper.service.UserService;
import com.jasper.mapper.UsersMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Author jasper @Date 2024-11-15
 *
 * @version 1.0
 */
@RequiredArgsConstructor
@Service
public class UserServiceImpl extends ServiceImpl<UsersMapper,Users> implements  UserService{

    private final UsersMapper mapper;
    @Override
    public Users selectByPrimaryKey(Integer id) {
        return mapper.selectById(id);
    }

    @Override
    @Log
    public Users selectByName(String name) {
        LambdaQueryWrapper<Users> wrapper = new LambdaQueryWrapper<Users>().eq(Users::getName, name);
        return mapper.selectOne(wrapper);
    }
}
