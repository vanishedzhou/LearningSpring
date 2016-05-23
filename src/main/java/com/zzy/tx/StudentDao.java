package com.zzy.tx;

import java.util.List;

public interface StudentDao {
	public void create(String name, int age, int year);
	public List<StudentMarks> listAllStudentMarks();

}
