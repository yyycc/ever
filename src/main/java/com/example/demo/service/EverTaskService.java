package com.example.demo.service;

import com.example.demo.dto.EverTask;

public interface EverTaskService {
    /**
     * 插入任务
     *
     * @param everTask 任务对象
     */
    void insert(EverTask everTask);
}
