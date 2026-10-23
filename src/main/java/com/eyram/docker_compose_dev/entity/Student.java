package com.eyram.docker_compose_dev.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "student")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String name;
    private int age;
@ManyToMany(mappedBy = "student", fetch = FetchType.LAZY)
    private Set<Course> courses= new HashSet<>();

}
