package com.example.demo.controllers;

import com.example.demo.dto.EverTask;
import com.example.demo.service.EverTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
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

    @RequestMapping(value = "/query")
    public List<EverTask> insert(@RequestBody EverTask everTask, HttpServletResponse response) throws ParseException {
        response.setHeader("Access-Control-Allow-Origin", "http://192.168.10.67:8081");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with, Content-Type");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        List<EverTask> tasks = taskService.queryTask(everTask);
        return tasks;
    }

    @RequestMapping(value = "/query/info")
    public List<EverTask> queryInfo(EverTask everTask, HttpServletResponse response) throws ParseException {
        response.setHeader("Access-Control-Allow-Origin", "http://192.168.10.67:8081");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with, Content-Type, token, Accept");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        List<EverTask> tasks = taskService.queryTask(everTask);
        return tasks;
    }

    @RequestMapping(value = "/update")
    public EverTask update(@RequestBody EverTask everTask) throws ParseException {
        taskService.updateTask(everTask);
        return everTask;
    }
}














