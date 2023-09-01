package com.liso.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liso.springboot.repositories.CourseRepository;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    public CourseService() {
    }

    public Course addCourseWithContents() {
        Course course = new Course();

        return courseRepository.save(course);
    }
}
