package com.example.demo.service.impl;

import com.example.demo.dto.EverTask;
import com.example.demo.mapper.EverTaskMapper;
import com.example.demo.service.EverTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EverTaskServiceImpl implements EverTaskService {
    @Autowired
    private EverTaskMapper taskMapper;

    @Override
    public void insert(EverTask everTask) {
        taskMapper.insertTask(everTask);
    }

    @Override
    public List<EverTask> queryTask(EverTask everTask) {
        return taskMapper.queryTask(everTask);
    }

    @Override
    public void updateTask(EverTask everTask) {
        taskMapper.updateTask(everTask);
    }
}
