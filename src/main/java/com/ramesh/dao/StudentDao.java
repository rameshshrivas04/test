package com.ramesh.dao;

import java.util.List;

import com.ramesh.domain.Student;

public interface StudentDao {

	public void save(Student student);

	public List<Student> getAll();

}
