package com.ramesh.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import antlr.collections.List;

import com.ramesh.domain.Student;
import com.ramesh.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody
	String saveStudent(@PathVariable("id") Long studentid) {
		Student student = new Student();
		student.setFirstName("Ramesh");
		student.setStName("Shrivas");
		student.setAge(32L);
		this.studentService.save(student);
		return Student.toJson(student);

	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public @ResponseBody
	String allStudent() {

		return Student.toJsonArray(this.studentService.getAll());

	}
}
