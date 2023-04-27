package com.jvmeneses.hrworker.dto;

import com.jvmeneses.hrworker.entities.Worker;

public class WorkerDTO {

    private Long id;
    private String name;
    private Double dailyIncome;

    public WorkerDTO() {
    }

    public WorkerDTO(Long id, String name, Double dailyIncome) {
        this.id = id;
        this.name = name;
        this.dailyIncome = dailyIncome;
    }

    public WorkerDTO(Worker entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.dailyIncome = entity.getDailyIncome();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }
}
