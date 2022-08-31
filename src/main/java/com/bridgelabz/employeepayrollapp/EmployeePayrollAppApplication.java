package com.bridgelabz.employeepayrollapp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Modified the Rest Controller to demonstrate the various HTTP Methods.
 *  * Introducing DTO and Model to Employee Payroll App.
 *  * Introducing Services Layer in Employee Payroll App.
 *  * Ability for the Services Layer to store the Employee Payroll Data.
 *  * Use Lombok Library to auto generate getters and setters for the DTO.
 *  * Use Lombok Library for Logging.
 *  * Determine the Logging Levels, Logging to Console or File, Logging Patterns, etc based on this application running in
 *    Dev, Staging or Production
 *
 * @author : Dnyandeo Bansode
 * 31-08-2022
 */

@Slf4j
@SpringBootApplication
public class EmployeePayrollAppApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EmployeePayrollAppApplication.class, args);
        log.info("Employee Payroll Application Started in {} Environment", context.getEnvironment().getProperty("environment"));
        log.info("Employee Payroll DB User is {}", context.getEnvironment().getProperty("spring.datasource.username"));
    }
}
