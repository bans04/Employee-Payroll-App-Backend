package com.bridgelabz.employeepayrollapp.model;
import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDto;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "employee_table")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;
    private String name;
    private  long salary;

    public Employee() {
    }

    public Employee(EmployeePayrollDto employeePayrollDto) {
        this.employeeId = employeeId;
        this.name = employeePayrollDto.name;
        this.salary = employeePayrollDto.salary;
    }
}
