package com.sushant.spring.mentor_management.entities;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="mentor")
@ToString
public class Mentor {
   @Column(name = "mentor_id")
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id", referencedColumnName = "person_id",nullable = false)
    private Person person;


}
