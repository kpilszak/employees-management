package com.kpilszak.employeesmanagement.rest;

import com.kpilszak.employeesmanagement.common.Coach;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
