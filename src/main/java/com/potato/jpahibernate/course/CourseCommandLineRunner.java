package com.potato.jpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.potato.jpahibernate.course.springdatajpa.CourseSpringDataRepo;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepo repository;

//	@Autowired
//	private CourseJpaRepo repository;

	@Autowired
	private CourseSpringDataRepo repository;

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		repository.insert(new Course(1, "Learn AWS 8765", "in28"));
//		repository.insert(new Course(2, "Learn GCP 4567", "in28"));
//		repository.insert(new Course(3, "Learn Azure 657tyfg", "in28"));
//		repository.deleteById(2);
//		System.out.println(repository.findById(1));
//		System.out.println(repository.findById(2));
//	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(1, "8765 Learn AWS ", "in28"));
		repository.save(new Course(2, "312 Learn GCP 4567", "in28"));
		repository.save(new Course(3, "232r Learn Azure 657tyfg", "in28"));
		repository.deleteById(2l);
		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(3l));
	}

}
