package com.sushant.spring.mentor_management.entities;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


@Entity
@Table(name="intern")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "internId")
public class Intern {


    @Column(name = "intern_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int internId;

//    @JsonBackReference
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mentor_id" , referencedColumnName = "mentor_id", nullable = false)
    private Mentor mentor;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id", referencedColumnName = "person_id",nullable = false)
    private Person person;

}
