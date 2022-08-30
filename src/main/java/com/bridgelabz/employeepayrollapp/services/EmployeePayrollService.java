package com.bridgelabz.employeepayrollapp.services;
import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDto;
import com.bridgelabz.employeepayrollapp.model.Employee;
import java.util.List;

public interface EmployeePayrollService {
    List<Employee> getEmployeeDetails();
    Employee getEmployeeDetailsById(int empId);
    Employee createEmployeeDetails(EmployeePayrollDto employeePayrollDto);
    Employee updateEmployeeDetails(int empId, EmployeePayrollDto employeePayrollDto);
    Employee deleteEmployeeDetails(int empId);
}
