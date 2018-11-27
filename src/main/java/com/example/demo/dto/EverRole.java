package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "role")
public class EverRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;
    /**
     * 用户名称
     */
    private String roleName;
    /**
     * N:不可用 Y:可用
     */
    private String enableFlag;
}
