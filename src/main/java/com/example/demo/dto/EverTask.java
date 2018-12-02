package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Table(name = "task")
public class EverTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
    private String taskContent;
    private String taskNumber;
    private String time;
    private Date dateFrom;
    private Date dateTo;
    private String status;
    private String description;
    private Date creationDate;
    private Date lastUpdateDate;
    private Long createdBy;
    private Long lastUpdatedBy;
}
