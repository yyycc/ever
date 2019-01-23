package com.example.demo.controllers;

import com.example.demo.dto.EverRole;
import com.example.demo.service.EverRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EverRoleController {
    @Autowired
    private EverRoleService roleService;

    @RequestMapping(value = "/role/query", method = RequestMethod.GET)
    public List<EverRole> query(String roleName, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with, Content-Type, token, Accept");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        EverRole role = roleService.queryByRoleName(roleName);
        List<EverRole> roles = new ArrayList<>();
        roles.add(role);
        return roles;
    }

    @RequestMapping(value = "/role/insert", method = RequestMethod.GET)
    public void insert() {
        EverRole role = new EverRole();
        role.setRoleName("ever");
        role.setEnableFlag("Y");
        roleService.insert(role);
    }

    @RequestMapping(value = "/role/queryList", method = RequestMethod.GET)
    public List<EverRole> queryList(){
        return roleService.queryList();
    }
}
