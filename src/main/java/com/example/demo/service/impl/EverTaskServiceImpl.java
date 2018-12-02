package com.example.demo.service.impl;

import com.example.demo.dto.EverTask;
import com.example.demo.mapper.EverTaskMapper;
import com.example.demo.service.EverTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EverTaskServiceImpl implements EverTaskService {
    @Autowired
    private EverTaskMapper taskMapper;

    @Override
    public void insert(EverTask everTask) {
        taskMapper.insertTask(everTask);
    }
}
