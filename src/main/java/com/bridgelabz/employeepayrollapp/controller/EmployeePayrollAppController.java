package com.bridgelabz.employeepayrollapp.controller;
import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//employee payroll app controller
@RestController
@RequestMapping("/employeepayrollapp")
public class EmployeePayrollAppController {
    //for getting all employee data
    @PostMapping("/create")
    public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeePayrollDto employeePayrollDTO){
        return new ResponseEntity<String>("Created Employee Payroll Data for:"+employeePayrollDTO, HttpStatus.OK);
    }

    //for get data by empId
    @GetMapping("/getalldata")
    public ResponseEntity<String> getEmployeePayrollData(){
        return new  ResponseEntity<String>("Employee Call Successfully", HttpStatus.OK);
    }

    //for update employee data by empId
    @GetMapping("/getemployeedatabyid")
    public  ResponseEntity<String> getEmployeePayrollData(@RequestParam int empId){
        return new  ResponseEntity<String> ("get call success for empId:" +empId, HttpStatus.OK);
    }

    //for delete employee data by empId
    @PutMapping("/update")
    public  ResponseEntity<String> updateEmployeePayrollData(@RequestParam int empId){
        return new  ResponseEntity<String> ("update employee payroll for empId:" +empId, HttpStatus.OK);
    }

    @DeleteMapping("/dalete")
    public  ResponseEntity<String> deleteEmployeePayrollData(@RequestParam int empId){
        return new  ResponseEntity<String> ("delete employee payroll data of empId:" +empId, HttpStatus.OK);
    }
}
