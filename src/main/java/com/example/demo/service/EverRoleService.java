package com.example.demo.service;

import com.example.demo.dto.EverRole;

import java.util.List;

public interface EverRoleService {
    /**
     * 插入角色
     *
     * @param role 角色对象
     */
    void insert(EverRole role);

    /**
     * 根据角色名模糊查询
     *
     * @param roleName 角色名
     * @return 角色列表
     */
    List<EverRole> queryByRoleName(String roleName);

    List<EverRole> queryList();

}
