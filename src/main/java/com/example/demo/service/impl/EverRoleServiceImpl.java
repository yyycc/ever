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
    public Boolean insert(EverRole role) {
        if (role == null){
            return false;
        }
        //roleMapper.insert(role);
        return true;
    }

    @Override
    public List<EverRole> queryByRoleName(String roleName) {
        EverRole role = new EverRole();
        role.setRoleName(roleName);
        List<EverRole> roles = new ArrayList<>();
        //roles = roleMapper.selectByCondition(role);
        return roles;
    }

    @Override
    public List<EverRole> queryList() {
        return roleMapper.queryList();
    }
}
