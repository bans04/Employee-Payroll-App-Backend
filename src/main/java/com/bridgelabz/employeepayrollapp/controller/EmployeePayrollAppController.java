package com.bridgelabz.employeepayrollapp.controller;
import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDto;
import com.bridgelabz.employeepayrollapp.dto.ResponceDto;
import com.bridgelabz.employeepayrollapp.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//employee payroll app controller
@RestController
@RequestMapping("/employeepayrollapp")
public class EmployeePayrollAppController {
    //for creating employee data
    @PostMapping("/create")
    public ResponseEntity<ResponceDto> addEmployeePayrollData(@RequestBody EmployeePayrollDto employeePayrollDTO){
        Employee employee = null;
        employee = new Employee(1,new EmployeePayrollDto("Dnyandeo",38000));
        ResponceDto responceDto = new ResponceDto("Employee payroll data created successfully", employee);
        return new ResponseEntity<ResponceDto>(responceDto, HttpStatus.OK);
    }

    //for get all employee data
    @GetMapping("/getalldata")
    public ResponseEntity<String> getEmployeePayrollData(){
        return new  ResponseEntity<String>("Employee Call Successfully", HttpStatus.OK);
    }

    //for get employee data by empId
    @GetMapping("/getemployeedatabyid")
    public  ResponseEntity<ResponceDto> getEmployeePayrollData(@RequestParam int empId){
        Employee employee = null;
        employee = new Employee(empId, new EmployeePayrollDto("Dnyandeo", 67768));
        ResponceDto responceDto = new ResponceDto("get employee of id",employee);
        return new  ResponseEntity<ResponceDto> (responceDto, HttpStatus.OK);
    }

    //for updating employee data by empId
    @PutMapping("/update")
    public  ResponseEntity<String> updateEmployeePayrollData(@RequestParam int empId){
        return new  ResponseEntity<String> ("update employee payroll for empId:" +empId, HttpStatus.OK);
    }

    //for deleting data of employee
    @DeleteMapping("/delete")
    public  ResponseEntity<String> deleteEmployeePayrollData(@RequestParam int empId){
        return new  ResponseEntity<String> ("delete employee payroll data of empId:" +empId, HttpStatus.OK);
    }
}
