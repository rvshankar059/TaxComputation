package com.employee.taxComputation.service;

import com.employee.taxComputation.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> saveEmployeeDetails(List<Employee> employeeDetails);

    List<Employee> getAllEmployees();

    Employee getByEmployeeId(String id);

    long getTaxDeduction(Employee employee);

    Employee saveEmployee(Employee employee);

}
