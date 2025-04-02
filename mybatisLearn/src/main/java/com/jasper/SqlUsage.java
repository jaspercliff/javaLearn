package com.jasper;

import com.jasper.mapper.SystemNoticeMapper;
import com.jasper.mapper.UsersMapper;
import com.jasper.pojo.SystemNotice;
import com.jasper.pojo.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

public class SqlUsage {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        try (SqlSession session = sqlSessionFactory.openSession()) {
            UsersMapper mapper = session.getMapper(UsersMapper.class);
           Users users =  mapper.selectUsersById(1);
            System.out.println("users = " + users);
            List<HashMap<String,Object>>  list = mapper.selectUsersAndHobbies();
            for (HashMap<String, Object> map : list) {
                map.forEach( (k,v)->{
                    System.out.println(k + " : " + v);
                });
            }

        }
    }
}
