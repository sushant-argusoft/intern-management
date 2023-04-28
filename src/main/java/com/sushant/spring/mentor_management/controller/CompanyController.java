package com.sushant.spring.mentor_management.controller;

import com.sushant.spring.mentor_management.entities.*;
import com.sushant.spring.mentor_management.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;
    @Autowired
    private PersonService personService;


    @Autowired
    private MentorService mentorService;
    @Autowired
    private InternService internService;
    @Autowired
    private CourseService courseService;
    @GetMapping("/getCompany")
     public List<Company> getAllCompany(){
        return companyService.getAll();
    }
    @GetMapping("/getAddress/{getId}")
    public Address getCompanyAddress(@PathVariable int getId){
        return companyService.get(getId).getAddress();
    }
    @GetMapping("/getPerson")
    public List<Person> getAllPerson(){
        return personService.getAll();
    }
    @GetMapping("/getPerson/{getId}")
    public Address getPersonAddress(@PathVariable int getId){
        return personService.get(getId).getAddress();
    }
    @GetMapping("/getMentor")
    public List<Mentor> getAllMentors(){
        return mentorService.getAllMentor();
    }
    @GetMapping("/getIntern")
    public List<Intern> getAllInterns(){
        return internService.getAllIntern();
    }

    @GetMapping("/getCourse")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }
    @PostMapping("/saveCourse")
    public Course saveCourse(@RequestBody Course course){
        return courseService.create(course);
    }
}
