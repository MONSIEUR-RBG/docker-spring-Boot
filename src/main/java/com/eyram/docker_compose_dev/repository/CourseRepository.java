package com.eyram.docker_compose_dev.repository;

import com.eyram.docker_compose_dev.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
