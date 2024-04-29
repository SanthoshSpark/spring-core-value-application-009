package com.spring.core.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean
    public EmployeeService employeeService() {
        return new EmployeeService();
    }
}

