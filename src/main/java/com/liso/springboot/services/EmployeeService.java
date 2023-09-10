package com.liso.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liso.springboot.entities.Employee;
import com.liso.springboot.repositories.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeService() {

    }

    public List<Employee> saveAllEmployees(List<Employee> employees) {
        return employeeRepository.saveAll(employees);
    }

    protected Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public List<Employee> findEmployeesByIds(List<Integer> ids) {
        return employeeRepository.findAllById(ids);
    }

    public Employee findAllEmployeeById(int id) {
        return employeeRepository.findById(id);
    }

    public List<Employee> findEmployeesByName(String employeename) {
        return employeeRepository.findByEmployeename(employeename);
    }

}
