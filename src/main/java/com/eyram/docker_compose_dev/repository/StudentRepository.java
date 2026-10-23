package com.eyram.docker_compose_dev.repository;

import com.eyram.docker_compose_dev.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
