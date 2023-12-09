package com.potato.jpahibernate.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.potato.jpahibernate.course.Course;

public interface CourseSpringDataRepo extends JpaRepository<Course, Long> {

}
