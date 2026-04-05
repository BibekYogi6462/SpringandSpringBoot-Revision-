package com.bibek.CrudRestAPi.service.impl;

import com.bibek.CrudRestAPi.model.Employee;
import com.bibek.CrudRestAPi.repository.EmployeeRepository;
import com.bibek.CrudRestAPi.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findByEmployeeId(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {
        Employee existingEmployee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());
         employeeRepository.save(employee);
        return existingEmployee;
    }

    @Override
    public void deleteEmployee(long id) {
         employeeRepository.deleteById(id);
    }
}
