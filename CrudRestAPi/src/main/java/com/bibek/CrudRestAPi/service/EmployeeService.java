package com.bibek.CrudRestAPi.service;

import com.bibek.CrudRestAPi.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee findByEmployeeId(Long id);
    Employee updateEmployee(Employee employee, long id);
    void deleteEmployee(long id);


}
