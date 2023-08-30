package com.liso.springboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "courses")
public class Course {

    @Id
    @Columne(name = "course_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    praivate String coursename;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCoursename(){
        return coursename;
    }

    public void setCoursename(String coursename){
        this.coursename = coursename;
    }
}
