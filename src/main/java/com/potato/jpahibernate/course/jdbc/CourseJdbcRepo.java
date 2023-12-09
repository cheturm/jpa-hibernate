package com.potato.jpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.potato.jpahibernate.course.Course;

@Repository
public class CourseJdbcRepo {
	@Autowired
	private JdbcTemplate potatoJdbcTemplate;

	private static String INSERT_QUERY = """
			insert into course(id,name,author) values (?,?,?);
			""";
	private static String DELETE_QUERY = """
			delete from course where id=?
			""";
	private static String SELECT_QUERY = """
			select * from course where id=?
			""";

	public void insert(Course course) {
		potatoJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}

	public void delete(long id) {
		potatoJdbcTemplate.update(DELETE_QUERY, id);
	}
	public Course findById(long id) {
		return potatoJdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class), id);
	}

}
