package com.ramesh.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ramesh.dao.StudentDao;
import com.ramesh.domain.Contact;
import com.ramesh.domain.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Student student) {

		Session session = sessionFactory.openSession();
		session.saveOrUpdate(student);
		Contact contact = new Contact();
		contact.setAddress("Near palasia");
		contact.setCity("indore");
		contact.setPinCode("452001");
		contact.setStudent(student);
		
		Contact contact1 = new Contact();
		contact1.setAddress("Near 123");
		contact1.setCity("indore");
		contact1.setPinCode("452001");
		contact1.setStudent(student);
		
		Contact contact2 = new Contact();
		contact2.setAddress("Near 234");
		contact2.setCity("indore");
		contact2.setPinCode("452001");
		contact2.setStudent(student);
		session.save(contact);
		session.save(contact1);
		session.save(contact2);
		System.out.println("Student saved.");
		session.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getAll() {
		Session session = this.sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		return criteria.list();
	}

}
