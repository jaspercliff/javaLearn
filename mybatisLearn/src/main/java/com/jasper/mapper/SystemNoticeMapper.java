package com.jasper.mapper;

import com.jasper.pojo.SystemNotice;
import org.apache.ibatis.annotations.Select;

public interface SystemNoticeMapper {

    SystemNotice selectSystemNoticeById(Integer id);

    @Select("select * from system_notice where id = #{id}")
    SystemNotice selectById(Integer id);
}
