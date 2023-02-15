package com.employee.taxComputation.controller;

import com.employee.taxComputation.entity.Employee;
import com.employee.taxComputation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee/{employee}")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employeeDetails){
        Employee employee= employeeService.saveEmployee(employeeDetails);

        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    @GetMapping("/getTaxDeductionAmt/{employee}")
    public long getTaxDeduction(@RequestBody Employee employeeDetails){
        return employeeService.getTaxDeduction(employeeDetails);
    }
}
