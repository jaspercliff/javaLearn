package com.jasper.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jasper.domains.Users;

public interface UserService  extends IService<Users> {

    Users selectByPrimaryKey(Integer id);

    Users selectByName(String sex);
}
