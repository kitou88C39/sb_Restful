package com.liso.springboot.controller;

import java.util.List;

import com.liso.springboot.Pojos.CityRequest;
import com.liso.springboot.Pojos.CourseRequest;
import com.liso.springboot.entities.City;
import com.liso.springboot.entities.Course;
import com.liso.springboot.entities.Employee;
import com.liso.springboot.repositories.EmployeeRepository;
import com.liso.springboot.services.CityService;
import com.liso.springboot.services.CourseService;
import com.liso.springboot.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employees/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("addemployees")
    public List<Employee> addAllEmployees(@RequestBody List<Employee> employees) {
        return employeeService.saveAllEmployees(employees);
    }

    @GetMapping("allemployees")
    public List<Employee> getAllEmployees() {
        return employeeService.findAllEmployees();
    }

    @GetMapping("employeeswithname")
    public List<Employee> addAllEmployeesWithname(@RequestParam String employeename) {
        return employeeService.findEmployeesByName(employeename);
    }

    @GetMapping("employeebyid")
    public Employee getEmployeeById(@RequestParam int id) {
        return employeeService.findEmployeeById(id);
    }

    @GetMapping("employeebyids")
    public List<Employee> getEmployeeByIds(@RequestBody List<Integer> ids) {
        return employeeService.findAllEmployeesByIds(ids);
    }

    @GetMapping("empByDeptAndAge")
    public List<Employee> getEmpByDeptAndAge(@RequestParam String department, @RequestParam int age) {
        return employeeRepository.findByDepartmentAndAngeLessThan(department, age);
    }
}