package com.sushant.spring.mentor_management.services;

import com.sushant.spring.mentor_management.entities.Course;

import java.util.List;

public interface CourseService {

    Course create(Course course);
    List<Course> getAllCourses();

}
