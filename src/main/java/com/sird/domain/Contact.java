package com.sird.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;

@Entity
public class Contact implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String address;
	private String city;
	private String pinCode;
	private String state;
//	@ManyToOne
//	private Student student;
//
//	public Student getStudent() {
//		return student;
//	}
//
//	public void setStudent(Student student) {
//		this.student = student;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public static String toJson(Contact contact) {

		return new JSONSerializer().serialize(contact);
	}

	public static String toJsonArray(List<Contact> contact) {

		return new JSONSerializer().serialize(contact);
	}

	public Contact fromJsonToStudent(String json) {
		return new JSONDeserializer<Contact>().deserialize(json, Contact.class);
	}
}
