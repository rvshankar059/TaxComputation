package com.employee.taxComputation.service;

import com.employee.taxComputation.entity.Employee;
import com.employee.taxComputation.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public List<Employee> saveEmployeeDetails(List<Employee> allEmployeeDetails) {
        return employeeRepo.saveAll(allEmployeeDetails);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee getByEmployeeId(String id) {
        return null;
    }

    @Override
    public long getTaxDeduction(Employee employee) {

        return 0;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }
}
