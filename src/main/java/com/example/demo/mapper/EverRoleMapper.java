package com.example.demo.mapper;

import com.example.demo.dto.EverRole;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EverRoleMapper{
    @Select("select * from role")
    @Results({
            @Result(property = "roleId", column = "role_id"),
            @Result(property = "roleName", column = "role_name"),
            @Result(property = "enableFlag", column = "enable_flag") })
    public List<EverRole> queryList();

    void insert(EverRole role);
}
