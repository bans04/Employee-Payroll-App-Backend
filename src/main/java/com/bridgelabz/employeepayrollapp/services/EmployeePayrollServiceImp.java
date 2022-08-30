package com.bridgelabz.employeepayrollapp.services;
import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDto;
import com.bridgelabz.employeepayrollapp.model.Employee;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollServiceImp implements EmployeePayrollService {

    ArrayList<Employee> employeeList = new ArrayList();

    @Override
    public List<Employee> getEmployeeDetails() {
        return employeeList;
    }

    @Override
    public Employee getEmployeeDetailsById(int employeeId) {
        return employeeList.get(employeeId - 1);
    }

    @Override
    public Employee createEmployeeDetails(EmployeePayrollDto employeePayrollDto) {
        Employee employee = null;
        employee = new Employee(employeeList.size() + 1, employeePayrollDto);
        employeeList.add(employee);
        return employee;
    }

    @Override
    public Employee updateEmployeeDetails(int employeeId, EmployeePayrollDto employeePayrollDto) {
        Employee employee = employeeList.get(employeeId - 1);
        employee.setName(employeePayrollDto.name);
        employee.setSalary(employeePayrollDto.salary);
        return employee;
    }

    @Override
    public Employee deleteEmployeeDetails(int employeeId) {
        Employee employee = null;
        employee = employeeList.get(employeeId);
        employeeList.remove(employee);
        return employee;
    }
}
