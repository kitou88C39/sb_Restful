package com.liso.springboot.repositories;

import com.liso.springboot.entities.CourseContents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseContentRepository extends JpaRepository<CourseContents, Integer> {

    public CourseContents findById(int id);

}
