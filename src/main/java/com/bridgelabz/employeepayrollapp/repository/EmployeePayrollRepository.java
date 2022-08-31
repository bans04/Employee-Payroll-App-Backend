package com.bridgelabz.employeepayrollapp.repository;
import com.bridgelabz.employeepayrollapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Use JpaRepository to perform some basic crude operation on database
 */
@Repository
public interface EmployeePayrollRepository extends JpaRepository<Employee,Integer> {

}
