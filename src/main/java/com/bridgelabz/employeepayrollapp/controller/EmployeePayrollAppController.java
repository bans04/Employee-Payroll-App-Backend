package com.bridgelabz.employeepayrollapp.controller;
import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDto;
import com.bridgelabz.employeepayrollapp.dto.ResponceDto;
import com.bridgelabz.employeepayrollapp.model.Employee;
import com.bridgelabz.employeepayrollapp.services.EmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//employee payroll app controller
@RestController
@RequestMapping("/employeepayrollapp")
public class EmployeePayrollAppController {

    @Autowired
    EmployeePayrollService employeePayrollService;

    //for creating employee data
    @PostMapping("/create")
    public ResponseEntity<ResponceDto> addEmployeePayrollData(@RequestBody EmployeePayrollDto employeePayrollDTO){
        Employee employee = null;
        employee = employeePayrollService.createEmployeeDetails(employeePayrollDTO);
        ResponceDto responceDto = new ResponceDto("Employee payroll data created successfully", employee);
        return new ResponseEntity<ResponceDto>(responceDto, HttpStatus.OK);
    }

    //for get all employee data
    @GetMapping("/employees")
    public ResponseEntity<ResponceDto> getEmployeePayrollData(){
        Employee employee = null;
        List<Employee> employeeList = employeePayrollService.getEmployeeDetails();
        ResponceDto responceDto = new ResponceDto("Employee details call", employeeList);
        return new  ResponseEntity<ResponceDto>(responceDto, HttpStatus.OK);
    }

    //for get employee data by empId
    @GetMapping("/employee")
    public  ResponseEntity<ResponceDto> getEmployeePayrollData(@RequestParam int employeeId){
        Employee employee = null;
        employee = employeePayrollService.getEmployeeDetailsById(employeeId);
        ResponceDto responceDto = new ResponceDto("get employee of id",employee);
        return new  ResponseEntity<ResponceDto> (responceDto, HttpStatus.OK);
    }

    //for updating employee data by empId
    @PutMapping("/update")
    public  ResponseEntity<ResponceDto> updateEmployeePayrollData(@RequestParam int employeeId, @RequestBody EmployeePayrollDto employeePayrollDto){
        Employee employee = null;
        employee = employeePayrollService.updateEmployeeDetails(employeeId, employeePayrollDto);
        ResponceDto responceDto = new ResponceDto("update employee payroll for empId:", employee);
        return new  ResponseEntity<ResponceDto> (responceDto, HttpStatus.OK);
    }

    //for deleting data of employee
    @DeleteMapping("/delete")
    public  ResponseEntity<ResponceDto> deleteEmployeePayrollData(@RequestParam int employeeId){
        Employee employee = null;
        employee = employeePayrollService.deleteEmployeeDetails(employeeId);
        ResponceDto responceDto = new ResponceDto("Deleted Succesfully", employee);
        return new  ResponseEntity<ResponceDto> (responceDto, HttpStatus.OK);
    }
}
