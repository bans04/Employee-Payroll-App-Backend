package com.bridgelabz.employeepayrollapp.dto;

public class EmployeePayrollDto {
    //Employee Payroll DTO fields
    public String name;
    public long salary;

    public EmployeePayrollDto(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    //Generate toString method
    @Override
    public String toString() {
        return "EmployeePayrollDto{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
