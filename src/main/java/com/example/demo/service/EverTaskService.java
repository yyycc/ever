package com.example.demo.service;

import com.example.demo.dto.EverTask;

import java.util.List;

public interface EverTaskService {
    /**
     * 插入任务
     *
     * @param everTask 任务对象
     */
    void insert(EverTask everTask);

    /**
     * 查詢任务
     *
     * @param everTask 任务对象
     */
    List<EverTask> queryTask(EverTask everTask);
}
