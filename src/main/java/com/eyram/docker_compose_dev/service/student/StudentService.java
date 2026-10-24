package com.eyram.docker_compose_dev.service.student;

import com.eyram.docker_compose_dev.entity.Student;
import com.eyram.docker_compose_dev.exception.ResourceNotFoundException;
import com.eyram.docker_compose_dev.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class StudentService implements IStudentService{

    private final StudentRepository studentRepository;
    @Override
    public Student getStudentById(int studentId) {
        return studentRepository.findById(studentId)
                .orElseThrow(()-> new ResourceNotFoundException("")) ;
    }

    @Override
    public String getStudentByName(String studentName) {
        return "";
    }

    @Override
    public List<Student> getAllStudents() {
        return List.of();
    }

    @Override
    public Student addStudent(Student student) {
        return null;
    }

    @Override
    public Student updateStudent(Student student, int studentId) {
        return null;
    }

    @Override
    public void deleteStudent(int studentId) {
studentRepository.findById(studentId)
        .ifPresentOrElse(studentRepository::delete, ()-> {throw new ResourceNotFoundException("Student not found with this id " + studentId);
        }
);
    }

    @Override
    public Student getStudentByCourseName(String courseName) {
        return null;
    }
}
