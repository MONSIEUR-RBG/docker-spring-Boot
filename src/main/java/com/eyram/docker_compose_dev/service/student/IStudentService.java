package com.eyram.docker_compose_dev.service.student;

import com.eyram.docker_compose_dev.entity.Student;

import java.util.List;

public interface IStudentService {
    Student getStudentById(int studentId);
    String getStudentByName(String studentName);
    List<Student> getAllStudents();
    Student addStudent (Student student);
    Student updateStudent(Student student, int studentId);
    void deleteStudent(int studentId);
    Student getStudentByCourseName(String courseName);
}
