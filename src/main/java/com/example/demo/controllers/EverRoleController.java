package com.example.demo.controllers;

import com.example.demo.dto.EverRole;
import com.example.demo.service.EverRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EverRoleController {
    @Autowired
    private EverRoleService roleService;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String query(String roleName){
        List<EverRole> roles = roleService.queryByRoleName(roleName);
        return roleName;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public void insert() {
        EverRole role = new EverRole();
        role.setRoleName("ever");
        role.setEnableFlag("Y");
        roleService.insert(role);
    }

    @RequestMapping(value = "/queryList", method = RequestMethod.GET)
    public List<EverRole> queryList(){
        return roleService.queryList();
    }
}
