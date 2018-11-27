package com.example.demo.mapper;

import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
/**
 * 这是mapper的通用接口
 * @author cyy
 * @date 2018-11-27 14:00
 **/
public interface  EverMapper<T> extends Mapper<T>, MySqlMapper<T>, ConditionMapper<T> {
}
