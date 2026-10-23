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
@Builder
public class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String name;
    private int age;
@ManyToMany(mappedBy = "students", fetch = FetchType.LAZY)
    private Set<Course> courses= new HashSet<>();
 //Helper methods
    public void addCourse(Course course){
        courses.add(course);
        course.getStudents().add(this);

    }
    public void removeCourse(Course course){
        courses.remove(course);
        course.getStudents().remove(this);
    }
}
