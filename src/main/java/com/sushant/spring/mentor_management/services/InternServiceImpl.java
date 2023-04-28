package com.sushant.spring.mentor_management.services;

import com.sushant.spring.mentor_management.entities.Intern;
import com.sushant.spring.mentor_management.repositories.InternRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class InternServiceImpl implements  InternService{

    InternRep internRep ;
     @Autowired
     InternServiceImpl(InternRep internRep){
         this.internRep = internRep;
     }


    @Override
    public Intern create(Intern intern) {
        return this.internRep.save(intern);
    }

    @Override
    public List<Intern> getAllIntern() {
        return this.internRep.findAll();
    }
}
