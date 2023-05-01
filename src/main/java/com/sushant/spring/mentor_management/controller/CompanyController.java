package com.sushant.spring.mentor_management.controller;

import com.sushant.spring.mentor_management.dto.CourseDTO;
import com.sushant.spring.mentor_management.entities.*;
import com.sushant.spring.mentor_management.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private CompanyService companyService;

    private PersonService personService;



    private MentorService mentorService;

    private InternService internService;

    private CourseService courseService;

    private  CategoryService categoryService;
  @Autowired
    public CompanyController(CompanyService companyService, PersonService personService, MentorService mentorService, InternService internService, CourseService courseService, CategoryService categoryService) {
        this.companyService = companyService;
        this.personService = personService;
        this.mentorService = mentorService;
        this.internService = internService;
        this.courseService = courseService;
        this.categoryService = categoryService;
    }

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
    @GetMapping("/getIntern/{getId}")
    public Intern getInternById(@PathVariable int getId){
        return internService.getIntern(getId);
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
    public Course saveCourse(@RequestBody CourseDTO courseDTO){
//        System.out.println(courseDTO);
//        List<Intern> interns = new ArrayList<>();
////        System.out.println(internService.getIntern(1));
////        for(int i : courseDTO.getInternList()){
////            interns.add(internService.getIntern(i));
////        }
//        Course course = new Course(courseDTO.getCourseId(),
//                courseDTO.getCourseName(),
//                categoryService.getCategory(courseDTO.getcId()),
//                companyService.get(courseDTO.getCompanyId()),
//                interns) ;



        return courseService.save(courseDTO);
    }
    @PostMapping("/saveCompany")
    public Company saveCompany(@RequestBody Company company){
        return companyService.create(company);
    }

}
