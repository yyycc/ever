package com.example.demo.service.impl;

import com.example.demo.dto.EverRole;
import com.example.demo.mapper.EverRoleMapper;
import com.example.demo.service.EverRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EverRoleServiceImpl implements EverRoleService {
    @Autowired
    private EverRoleMapper roleMapper;

    @Override
    public void insert(EverRole role) {
        roleMapper.insertRole(role);
    }

    @Override
    public EverRole queryByRoleName(String roleName) {
        EverRole role = new EverRole();
        role.setRoleName(roleName);
        role = roleMapper.queryByRoleName(role);
        return role;
    }

    @Override
    public List<EverRole> queryList() {
        return roleMapper.queryList();
    }
}
