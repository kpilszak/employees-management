package com.kpilszak.employeesmanagement.common;

import com.kpilszak.employeesmanagement.common.Coach;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
