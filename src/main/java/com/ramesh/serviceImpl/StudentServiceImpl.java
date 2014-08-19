package com.ramesh.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramesh.dao.StudentDao;
import com.ramesh.domain.Contact;
import com.ramesh.domain.Student;
import com.ramesh.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public void getOne(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Student> getAll() {

		List<Student> students = this.studentDao.getAll();
		for(Student student : students){
			for(Contact contact : student.getContact()){
				 System.out.println("address : "+contact.getId());
			}
		}
		return students;
	}

	@Override
	public void save(Student student) {
		this.studentDao.save(student);
	}

}
