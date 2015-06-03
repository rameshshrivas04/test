package com.sird.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sird.domain.Assembly;
import com.sird.repository.AssemblyRepository;

@Controller
@RequestMapping("/st")
public class SchemeController {

	@Autowired
	private  AssemblyRepository assemblyRepository;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody
	String getSchemeDetail(@PathVariable("id") Long schemeid) {
		System.out.println("-------");
		List<Assembly> assemblies = assemblyRepository.findAll();  
		return Assembly.toJsonArray(assemblies);
		//Student.toJsonArray(assemblies);
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public @ResponseBody
	String getAllSchemeDetails() {

//		List<Student> assemblies = assemblyDao.getAll();
//		return Student.toJsonArray(assemblies);
	return "";
	}
}
