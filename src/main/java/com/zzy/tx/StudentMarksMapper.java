package com.zzy.tx;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMarksMapper implements RowMapper<StudentMarks>{

	@Override
	public StudentMarks mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentMarks stu = new StudentMarks();
		stu.setId(rs.getInt("id"));
		stu.setName(rs.getString("name"));
		stu.setAge(rs.getInt("age"));
		stu.setSid(rs.getInt("sid"));
		stu.setMarks(rs.getInt("marks"));
		stu.setYear(rs.getInt("year"));

		return stu;
	}

}
