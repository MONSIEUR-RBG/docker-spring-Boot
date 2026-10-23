package com.eyram.docker_compose_dev.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    //Here we put the joinTable
    @JoinTable(name = "student_courses",
    joinColumns = @JoinColumn(name = "courses_id"),
    inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private Set<Student> students= new HashSet<>();


}
