package com.bridgelabz.employeepayrollapp.dto;

public class EmployeePayrollDto {
    //Employee Payroll DTO fields
    private String name;
    private long salary;

    //Generate toString method
    @Override
    public String toString() {
        return "EmployeePayrollDto{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
