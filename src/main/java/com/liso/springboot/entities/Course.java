package com.liso.springboot.entities;

import java.util.Set;

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

    private String coursename;

    @ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    @JoinTable(name = "course_coursecontents_mapping", joinColumns = @JoninColumn(name = "course_id"), inverseJoinColumns = @JoinColumn(name = "content_id"))
    private Set<CourseContents> coursecontents;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

}
