package com.ns.clould.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.ns.clould.bean.UserMain;

@Mapper
public interface UserMainMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(UserMain record);

    int insertSelective(UserMain record);

    UserMain selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(UserMain record);

    int updateByPrimaryKey(UserMain record);
}