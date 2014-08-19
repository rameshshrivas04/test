package com.ramesh.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;

@Entity
public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	private String firstName;
	private String stName;
	private Long age;

	@OneToMany (fetch = FetchType.EAGER)
	@JoinColumn(name="STUDENT_ID")
	private List<Contact> contact;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}

	public static String toJson(Student student) {

		return new JSONSerializer().serialize(student);
	}

	public static String toJsonArray(List<Student> students) {

		return new JSONSerializer().include("contact").serialize(students);
	}

	public Student fromJsonToStudent(String json) {
		return new JSONDeserializer<Student>().deserialize(json, Student.class);
	}
}
