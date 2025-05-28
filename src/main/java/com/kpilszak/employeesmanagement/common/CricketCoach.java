package com.kpilszak.employeesmanagement.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void doStartup() {
        System.out.println("In doStartup(): " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doCleanup() {
        System.out.println("In doCleanup(): " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
