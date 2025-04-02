package com.jasper.mapper;

import com.jasper.pojo.Users;

import java.util.HashMap;
import java.util.List;

public interface UsersMapper {

    List<HashMap<String,Object>> selectUsersAndHobbies();

    Users selectUsersById(Integer id);
}
