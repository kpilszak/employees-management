package com.kpilszak.employeesmanagement.config;

import com.kpilszak.employeesmanagement.common.Coach;
import com.kpilszak.employeesmanagement.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
