package com.zzy.jdbc;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class StudentJdbcTemplate implements StudentDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall jdbcCall;
	
	public StudentJdbcTemplate(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource); 
		this.jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
	}
	
	public Student queryWithSP(int id) {
		SqlParameterSource sqlParameterSource = new MapSqlParameterSource().addValue("in_id", id);
		Map<String, Object> map = jdbcCall.execute(sqlParameterSource);
		Student stu = new Student();
		stu.setId(id);
		stu.setName((String) map.get("out_name"));
		stu.setAge((int) map.get("out_age"));
		System.out.println(stu);
		
		return stu;
	}

	@Override
	public void create(String name, int age) {
		String sql = "insert into student(name,age) values(?,?)";
		jdbcTemplate.update(sql, name, age);
		System.out.println("---create student record, name:" + name + " age: " + age);

	}

	@Override
	public Student queryById(int id) {
		String sql = "select * from student where id=?";
		Student stud = jdbcTemplate.queryForObject(sql, new Object[]{id}, new StudentMapper());
		System.out.println("--query for student record with id:" + id);
		System.out.println(stud);

		return stud;
	}

	@Override
	public void update(int id, String name, int age) {
		String sql = "update student set name=?, age=? where id=?";
		jdbcTemplate.update(sql, name, age, id);
		System.out.println("---update student record with id:" + id);
	}

	@Override
	public void deleteById(int id) {
		String sql = "delete from student where id=?";
		jdbcTemplate.update(sql, id);
		System.out.println("---delete record from student where id=" + id);
	}

}
