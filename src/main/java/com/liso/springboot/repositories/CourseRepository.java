package com.liso.springboot.repositories;

import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

    public Course findById(int id);
}
