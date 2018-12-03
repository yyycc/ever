package com.example.demo.controllers;

import com.example.demo.dto.EverTask;
import com.example.demo.service.EverTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class EverTaskController {

    @Autowired
    private EverTaskService taskService;
    SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");

    @RequestMapping(value = "/insert")
    public List<EverTask> insert(@RequestBody Object[] objs) throws ParseException {
        Object objectInfo = ((LinkedHashMap) objs[0]).get("columnsInfo");
        Object objectStatus = ((LinkedHashMap) objs[0]).get("status");
        Object objectTime = ((LinkedHashMap) objs[0]).get("time");
        Date today = new Date();
        String dateString = sd.format(today);
        List<EverTask> tasks = new ArrayList<>();
        for (int i = 0; i < ((ArrayList) objectInfo).size(); i++) {
            EverTask everTask = new EverTask();
            everTask.setTaskContent(((LinkedHashMap) ((ArrayList) objectInfo).get(i)).get("taskContent").toString());
            everTask.setTaskNumber(dateString + "-ever-task");
            everTask.setTime(objectTime.toString());
            everTask.setStatus(objectStatus.toString());
            everTask.setCreatedBy(1L);
            everTask.setCreationDate(today);
            everTask.setLastUpdateDate(today);
            everTask.setLastUpdatedBy(1L);
            taskService.insert(everTask);
            tasks.add(everTask);
        }
        return tasks;
    }
}














