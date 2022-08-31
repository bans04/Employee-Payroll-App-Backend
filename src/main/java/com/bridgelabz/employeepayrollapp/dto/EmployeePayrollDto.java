package com.bridgelabz.employeepayrollapp.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeePayrollDto {
    //Employee Payroll DTO fields
    @NotEmpty(message = "Employee name can't be null")
    @Pattern(regexp = "^[A-Z][A-Za-z]{3,}$", message = "Employee name is Invalid")
    public String name;

    @Min(value = 20000, message = "Min salary should be more than 20000")
    public long salary;
}
