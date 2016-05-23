package com.zzy.tx;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class StudentJdbcTemplate implements StudentDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public StudentJdbcTemplate() {
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public StudentJdbcTemplate(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource); 
	}

	@Override
	public void create(String name, int age, int year) {
		String sqlInsertIntoStudent = "insert into student(name, age) values(?,?)";
		String sqlQueryIdFromStudent = "select id from student where name=? and age=?";
		String sqlInsertIntoMarks = "insert into marks(marks, year) values(?,?)";

		try {
			jdbcTemplate.update(sqlInsertIntoStudent, name, age);
			System.out.println("---create student record: name=" + name + 
					" age=" + age);
			int sid = jdbcTemplate.queryForObject(sqlQueryIdFromStudent, Integer.class, name, age);
			System.out.println("the new added student record id=" + sid);
			jdbcTemplate.update(sqlInsertIntoMarks, sid, year);
			System.out.println("---create marks record: marks=" + sid +
					" year=" + year); 
//			throw new RuntimeException("zzy human interfered...");
			throw new DataAccessException("zzy interfered...") {
				private static final long serialVersionUID = 1L;
			};
		} catch (DataAccessException e) {
			System.out.println("exception occured, tx rolling back...");
			throw e;
		}
		
	}

	@Override
	public List<StudentMarks> listAllStudentMarks() {
		String sqlQueryAllRecord = "select * from student left join marks on student.id = marks.marks "
				+ "union select * from student right join marks on student.id = marks.marks";
		List<StudentMarks> list = jdbcTemplate.query(sqlQueryAllRecord, new StudentMarksMapper());
		return list;
	}
	
}
