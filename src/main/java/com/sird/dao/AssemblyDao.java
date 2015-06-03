package com.sird.dao;

import java.util.List;

import com.sird.domain.Student;

public interface AssemblyDao {

	public void save(Student assembly);

	public List<Student> getAll();

}
