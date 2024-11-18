package com.jasper.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jasper.domains.Users;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersMapper extends BaseMapper<Users> {
    int updateBatch(@Param("list") List<Users> list);

    int updateBatchUseMultiQuery(@Param("list") List<Users> list);

    int updateBatchSelective(@Param("list") List<Users> list);

    int batchInsert(@Param("list") List<Users> list);

    int deleteByPrimaryKeyIn(List<Integer> list);

    boolean insertOrUpdate(Users record);

    int insertOrUpdateSelective(Users record);
}