package com.liso.springboot.repositories;

import com.liso.springboot.entities.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

＠Repository

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee findById(int id);
    List<Employee> findByEmployeename(String employeename);

    List<Employee> findByDepartmentAndAngeGreaterThanEqual(String department, int age);

    List<Employee> findByEmployeenameStartigWith(String employeename);

    List<Employee> findByEmployeenameContaining(String employeename);

    List<Employee> findByEmployeenameEndingWith(String employeename);


    List<Employee> findTop5ByAge(int age);
    List<Employee> findByAgeBetween(int startage, int endage);
    List<Employee> findByAgeIn(List<Integer> agegroup);
}
