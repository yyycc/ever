package com.example.demo.mapper;

import com.example.demo.dto.EverTask;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EverTaskMapper {
    void insertTask(EverTask everTask);

    List<EverTask> queryTask(EverTask everTask);

    void updateTask(EverTask everTask);
}
