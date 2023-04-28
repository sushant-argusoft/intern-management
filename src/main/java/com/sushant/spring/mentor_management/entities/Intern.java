package com.sushant.spring.mentor_management.entities;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


@Entity
@Table(name="intern")
public class Intern {
    @Column(name = "intern_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mentor_id" , referencedColumnName = "mentor_id", nullable = false)
    private Mentor mentor;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id", referencedColumnName = "person_id",nullable = false)
    private Person person;
}
