package com.liso.springboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "courses")
public class CourseContents {

    @Id
    @Columne(name = "course_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    praivate String content;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }
}
