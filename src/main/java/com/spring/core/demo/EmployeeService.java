package com.spring.core.demo;

import org.springframework.beans.factory.annotation.Value;

public class EmployeeService {
    private Employee employee;

    // Inject values from properties file using @Value
    @Value("${employee.id}")
    private int employeeId;

    @Value("${employee.name}")
    private String employeeName;

    @Value("${employee.designation}")
    private String employeeDesignation;

    public void initializeEmployee() {
        // Create Employee object using injected values
        employee = new Employee(employeeId, employeeName, employeeDesignation);
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee Information:");
        System.out.println(employee);
    }
}
