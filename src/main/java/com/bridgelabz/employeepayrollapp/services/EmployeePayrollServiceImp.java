package com.bridgelabz.employeepayrollapp.services;
import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDto;
import com.bridgelabz.employeepayrollapp.model.Employee;
import com.bridgelabz.employeepayrollapp.repository.EmployeePayrollRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

/**
 * Service layer
 */
@Slf4j
@Service
public class EmployeePayrollServiceImp implements EmployeePayrollService {

    @Autowired
    EmployeePayrollRepository employeePayrollRepository;

    ArrayList<Employee> employeeList = new ArrayList();

    /**
     * Purpose : Ability to fetch all employee details from Database
     * @return
     */
    @Override
    public List<Employee> getEmployeeDetails() {
        log.info("Inside getEmployeeDetails");
        return employeePayrollRepository.findAll();

    }

    /**
     *Purpose : Ability to fetch employee details from Database
     * @param employeeId
     * @return
     */
    @Override
    public Employee getEmployeeDetailsById(int employeeId) {
        log.info("Inside getEmployeeDetailsById");
       return employeePayrollRepository.findById(employeeId).orElse(null);
    }

    /**
     * Purpose : Ability to add employee details in Database
     * @param employeePayrollDto
     * @return
     */
    @Override
    public Employee createEmployeeDetails(EmployeePayrollDto employeePayrollDto) {
        log.info("Inside createEmployeeDetails");
        Employee employee = null;
        employee = new Employee(employeePayrollDto);
        employee = employeePayrollRepository.save(employee);
        return employee;
    }

    /**
     * Purpose : Ability to update employee details in Database using ID
     * @param employeeId
     * @param employeePayrollDto
     * @return
     */
    @Override
    public Employee updateEmployeeDetails(int employeeId, EmployeePayrollDto employeePayrollDto) {
        log.info("Inside updateEmployeeDetails");
        Employee employee = getEmployeeDetailsById(employeeId);
        employee.setName(employeePayrollDto.name);
        employee.setSalary(employeePayrollDto.salary);
        log.debug("Employee Data: " + employee.toString());
        return employeePayrollRepository.save(employee);
    }

    /**
     * Purpose : Ability to Delete employee details Database using ID
     * @param employeeId
     * @return
     */
    @Override
    public Employee deleteEmployeeDetails(int employeeId) {
        log.info("Inside deleteEmployeeDetails");
        Employee employee = getEmployeeDetailsById(employeeId);
        employeePayrollRepository.delete(employee);
        return  employee;
    }
}
