package com.example.demo.mapper;

import com.example.demo.dto.EverTask;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EverTaskMapper {
    void insertTask(EverTask everTask);
}
