package com.spring.core.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		
		execute();
	}
	
	public static void execute() {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            // Retrieve the EmployeeService bean from the context
            EmployeeService employeeService = context.getBean(EmployeeService.class);

            // Initialize and display employee information
            employeeService.initializeEmployee();
            employeeService.displayEmployeeInfo();
        }
    }


}
