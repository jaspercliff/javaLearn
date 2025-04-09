package com.jasper.mapper;

import com.jasper.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface UsersMapper {

    List<HashMap<String,Object>> selectUsersAndHobbies();

    Users selectUsersById(Integer id);

    void insertUsers(Users users);

    void insertUsersWithParam(@Param("user") Users users);
}
