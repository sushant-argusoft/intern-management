package com.sushant.spring.mentor_management.services;

import com.sushant.spring.mentor_management.entities.Course;
import com.sushant.spring.mentor_management.repositories.CourseRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    CourseRep courseRep;
    @Autowired
    CourseServiceImpl(CourseRep courseRep){
        this.courseRep = courseRep;
    }
    @Override
    public Course create(Course course) {
        return courseRep.save(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRep.findAll();
    }
}
