package com.liso.springboot.repositories;

import com.liso.springboot.entities.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.repository;

＠Repository

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee findById(int id);
    List<Employee> findByEmploeename(String employeename);

}
