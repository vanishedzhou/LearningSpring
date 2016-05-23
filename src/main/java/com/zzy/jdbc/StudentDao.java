package com.zzy.jdbc;

public interface StudentDao {
	public void create(String name, int age);
	public Student queryById(int id);
	public void update(int id, String name, int age);
	public void deleteById(int id);

}
