package com.liso.springboot.services;

import static org.junit.jupiter.api.DynamicTest.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.liso.springboot.Pojos.CourseRequest;
import com.liso.springboot.entities.Course;
import com.liso.springboot.entities.CourseContents;
import com.liso.springboot.repositories.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseRepository coursecontentRepo;

    public CourseService() {
    }

    public Course addCourseWithContents(CourseRequest courseRequest) {
        Course course = new Course();
        course.setId(courseRequest.id);
        course.setCoursename(courseRequest.coursename);
        course.setCoursecontents(courseRequest.coursecontents
        .stream()
        .map(coursecontent -> {
            CourseContents contents = coursecontent;
            if(contents.getId() > 0){
               contents = coursecontentRepo.findById(contents.getId());
            }
            contents.getCourses().add(course)
        }))

        return courseRepository.save(course);
    }
}
