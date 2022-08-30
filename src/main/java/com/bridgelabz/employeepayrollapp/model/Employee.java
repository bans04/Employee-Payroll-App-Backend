package com.bridgelabz.employeepayrollapp.model;
import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDto;
import lombok.Data;

@Data
public class Employee {
    private int employeeId;
    private String name;
    private  long salary;

    public Employee() {
    }

    public Employee(int employeeId, EmployeePayrollDto employeePayrollDto) {
        this.employeeId = employeeId;
        this.name = employeePayrollDto.name;
        this.salary = employeePayrollDto.salary;
    }
}
