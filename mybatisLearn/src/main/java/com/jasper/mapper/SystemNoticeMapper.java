package com.jasper.mapper;

import com.jasper.pojo.SystemNotice;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;

public interface SystemNoticeMapper {

    SystemNotice selectSystemNoticeById(Integer id);

    @Select("select * from system_notice where id = #{id}")
    SystemNotice selectById(Integer id);

}
