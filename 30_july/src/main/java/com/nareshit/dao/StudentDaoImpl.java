package com.nareshit.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nareshit.model.Student;

public class StudentDaoImpl implements StudentDao{
	
	private String INSERT = "insert into student values(?,?,?)";
	
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void saveStudent(Student st) {
		jdbcTemplate.update(INSERT,st.getStuId(),st.getFirstName(),st.getLastName());
		
	}
	
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	
	
	
	
	
	
	
	

}
