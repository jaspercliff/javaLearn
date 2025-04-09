package com.jasper;

import com.jasper.mapper.UsersMapper;
import com.jasper.pojo.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class crudDemo {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        try {
             UsersMapper mapper = session.getMapper(com.jasper.mapper.UsersMapper.class);
            // 插入数据
            Users user = new Users("jasper", 24, "beijing");
            Users user1 = new Users("jasper", 24, "beijing");
            mapper.insertUsers(user);
            mapper.insertUsersWithParam(user1);
            session.commit();
        }catch (Exception e){
            e.printStackTrace();
            session.rollback();
        }finally {
          session.close();
        }

    }
}
