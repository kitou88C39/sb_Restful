package com.liso.springboot.entities;

import org.springframework.boot.autoconfigure.domain.Entity;

public class Employee {

}

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @column(name = "employee_id")
    private int id;
    private String employeename;
    private String department;
    private Date joiningdate;
    private int age;
    private String address;
    private float salary;
    private ZonedDateTime lefton;
    private boolean leftjob;

    public Employee() {

    public int getId() {
        return id;
    }

    public void setId(int id) {
    }

}
}