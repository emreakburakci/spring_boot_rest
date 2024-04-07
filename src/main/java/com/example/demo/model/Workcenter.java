package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Workcenter
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long workcenterId;
    private Long workcenterNo;
    private String workcenterName;

    public Long getWorkcenterId() {
        return workcenterId;
    }

    public void setWorkcenterId(Long workcenterId) {
        this.workcenterId = workcenterId;
    }

    public Long getWorkcenterNo() {
        return workcenterNo;
    }

    public void setWorkcenterNo(Long workcenterNo) {
        this.workcenterNo = workcenterNo;
    }

    public String getWorkcenterName() {
        return workcenterName;
    }

    public void setWorkcenterName(String workcenterName) {
        this.workcenterName = workcenterName;
    }
}
