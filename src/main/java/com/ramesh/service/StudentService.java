package com.ramesh.service;

import java.util.List;

import com.ramesh.domain.Student;

public interface StudentService {

	public void getOne(Long id);

	public List<Student> getAll();

	public void save(Student student);

}
