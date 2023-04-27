package com.sushant.spring.mentor_management.controller;

import com.sushant.spring.mentor_management.entities.Address;
import com.sushant.spring.mentor_management.entities.Company;
import com.sushant.spring.mentor_management.entities.Mentor;
import com.sushant.spring.mentor_management.entities.Person;
import com.sushant.spring.mentor_management.services.CompanyService;
import com.sushant.spring.mentor_management.services.MentorService;
import com.sushant.spring.mentor_management.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
