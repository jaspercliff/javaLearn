package com.jasper;

import com.jasper.mapper.SystemNoticeMapper;
import com.jasper.pojo.SystemNotice;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SimpleUsage {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        try (SqlSession session = sqlSessionFactory.openSession()) {
            SystemNoticeMapper mapper = session.getMapper(SystemNoticeMapper.class);
            SystemNotice systemNotice = mapper.selectSystemNoticeById(1);
            SystemNotice systemNotice1 = mapper.selectById(2);
            System.out.println(systemNotice.getTitle());
            System.out.println(systemNotice1.getTitle());
        }
    }
}
