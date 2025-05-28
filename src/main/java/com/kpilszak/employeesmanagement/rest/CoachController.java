package com.kpilszak.employeesmanagement.rest;

import com.kpilszak.employeesmanagement.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {
    private Coach coach;
    private Coach anotherCoach;

    @Autowired
    public CoachController(
            @Qualifier("cricketCoach") Coach coach,
            @Qualifier("cricketCoach") Coach anotherCoach) {
        this.coach = coach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: coach == anotherCoach" + (coach == anotherCoach);
    }
}
